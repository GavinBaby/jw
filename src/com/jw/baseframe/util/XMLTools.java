package com.jw.baseframe.util;

import java.io.*; //Java基础包，包含各种IO操作 
import java.net.URL;
import java.net.URLConnection;
import javax.xml.transform.*; 
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult; 
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.parsers.*; //XML解析器接口 
import org.w3c.dom.*; //XML的DOM实现 
import org.xml.sax.InputSource;

public class XMLTools {

	private DocumentBuilder db = null;
	private Document doc = null; 
	private NodeList children = null;
	public boolean opening = false;
	public String cdata_field = ""; //多个小节需要做cdata，通过空格分隔
	protected boolean exception = false;
    //析构函数
    protected void finalize()
    {
        close();
    }

    public void close()
    {
    	children = null;
        doc = null;
        db = null;
    }
    
    public XMLTools(InputSource is) {
    	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
    	try { 
    	db = dbf.newDocumentBuilder(); 
		doc = db.parse(is);
    	} 
		catch (Exception e) { 
			this.exception = true;
			return;	
		} 
		opening = true;
    }
    
	//该构造函数用于XML的读取
	public XMLTools(String url_or_string) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
		dbf.setNamespaceAware(true);//XPath计算表达式必须要用
		try { 
				db = dbf.newDocumentBuilder(); 

				if(url_or_string.toLowerCase().startsWith("http://"))
				{
					URL http = new URL(url_or_string);
					URLConnection conn = http.openConnection();
					doc = db.parse(conn.getInputStream());
				}
				else
				{
					doc = db.parse(url_or_string);
				}
				
			} 
		catch (Exception e) { 
			this.exception = true;
			return;	
		} 
       
		//--------------至此已完成打开xml文件fname的工作---------
		opening = true;
	}
	
	//该构造函数用于XML的读取
	public XMLTools(File f) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
		try { 
			db = dbf.newDocumentBuilder(); 
			doc = db.parse(f);
			} 
		catch (Exception e) { e.printStackTrace();return;	}
       //--------------至此已完成打开xml文件fname的工作---------

		opening = true;
	}
	//该构造函数用于XML的读取
	public XMLTools(InputStream is) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
		try { 
			db = dbf.newDocumentBuilder(); 
			doc = db.parse(is);
			} 
		catch (Exception e) { e.printStackTrace();return;	}
       //--------------至此已完成打开xml文件fname的工作---------

		opening = true;
	}
	
	public int getChildren(Element parent,String name)
	{
		if(this.exception)
			return 0;
		if(parent == null)
		{
			parent = doc.getDocumentElement();
		}
		children = null;
		children = parent.getElementsByTagName(name);
		if(children==null) return 0;
		return children.getLength();
	}
	public int getChildrenSize()
	{
		int size = 0;
		if(children!=null)
			size = children.getLength();
		return size;
	}
	public Element getChild(int index)
	{
		Element item = null;
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					item = (Element)children.item(index);
				}catch(Exception e){e.printStackTrace();}
			}
		}
		return item;
	}
	public String getChildValue(int index)
	{
		String value = "";
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					Element item = (Element)children.item(index);
					Text t = (Text) item.getFirstChild();
					if(t!=null) value = t.getNodeValue();
				}catch(Exception e){e.printStackTrace();}
			}
		}
		return value;
	}
	public String getChildValue()
	{
		int index = 0;
		String value = "";
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					Element item = (Element)children.item(index);
					Text t = (Text) item.getFirstChild();
					if(t!=null) value = t.getNodeValue();
				}catch(Exception e){e.printStackTrace();}
			}
		}
		return value;
	}
	
	//修改指定child的值
	public void setChildValue(int index,String value)
	{
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					Element item = (Element)children.item(index);
					Text t = (Text) item.getFirstChild();
					if(t!=null)
					{
						t.setNodeValue(value);
					}
					else
					{
						Text tName = doc.createTextNode(value); 
						item.appendChild(tName); 
					}
					
				}catch(Exception e){e.printStackTrace();}
			}
		}
	}
	public void setChildAttribute(int index,String name,String value)
	{
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					Element item = (Element)children.item(index);
					item.setAttribute(name, value);
				
				}catch(Exception e){e.printStackTrace();}
			}
		}
	}
	
	public String getChildAttribute(int index,String name)
	{
		String value = "";
		if(children!=null)
		{
			if(children.getLength() > index && index >= 0)
			{
				try{
					Element item = (Element)children.item(index);
					if(item.hasAttribute(name))
					{
						value = item.getAttribute(name);
					}
				}catch(Exception e){}
			}
		}
		return value;
	}
	
	//返回parent节点下的指定名称的所有元素
	public NodeList getitems(Element parent,String name)
	{
		NodeList items = null;
		if(parent == null)
		{
			parent = doc.getDocumentElement();
		}
		items = parent.getElementsByTagName(name);
		return items;
	}

	//获得元素值
	public String getitem(Element item)
	{
		String value = "";
		try{
			Text t = (Text) item.getFirstChild();
			value = t.getNodeValue();
		}catch(Exception e){}
		return value;
	}
	//获得元素值
	public String getAttribute(Element item,String name)
	{
		String value = "";
		if(item.hasAttribute(name))
		{
			value = item.getAttribute(name);
		}
		return value;
	}
	
	public NodeList getNodeList(String TagName)
	{
		NodeList items = null;
		Element root = doc.getDocumentElement();
		items = root.getElementsByTagName(TagName);
		//System.out.println(TagName+"=====  长度"+items.getLength());
		return items;
	}
	
	//该构造函数用于XML的写入
	public XMLTools() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
		try { 
			db = dbf.newDocumentBuilder(); 
			doc = db.newDocument();  //新建doc用于写入
			} 
		catch (Exception e) { e.printStackTrace();return;	}			
		opening = true;
	}
	
	public Element createRoot(String root,String attribute,String value)
	{
		Element xmlroot = doc.createElement(root); 
		if(attribute!=null)
			xmlroot.setAttribute(attribute, value);

		doc.appendChild(xmlroot); 
		return xmlroot;
	}
	public Element createRoot(String root)
	{
		Element xmlroot = doc.createElement(root); 
		doc.appendChild(xmlroot); 
		return xmlroot;
	}
	
	public Element addChild(Element parent,String text) 
	{
		Element item = doc.createElement(text); 
		parent.appendChild(item); 
		return item;
	}
	
	public void setItem(Element item,String text)
	{
		Text t = (Text) item.getFirstChild();
		if(t!=null) 
			t.setNodeValue(text);
		else
		{
			Text tName = doc.createTextNode(text); 
			item.appendChild(tName); 
		}
	}
	/*
	 * compute 示例 /route[@id='属性值']/route[@id='']/file[@url='']
	 */
	public int getChildren(String compute) {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		
		try {
			XPathExpression expr = xpath.compile(compute);
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			this.children = (NodeList) result;
		} catch (Exception ex) {
			return 0;
			//ex.printStackTrace();
		}
		if(children==null) return 0;
		return this.children.getLength();
	}
	
	//------lisy add 110602
	public NodeList getChildrenList(String compute) {
		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		
		try {
			XPathExpression expr = xpath.compile(compute);
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			this.children = (NodeList) result;
		} catch (Exception ex) {
			return null;
			//ex.printStackTrace();
		}
		if(children==null) return null;
		return this.children;
	}
	//------lisy end-----

	// 直接输出到OutputStream
	public void output(OutputStream ostream,String charset){
		try{
    		TransformerFactory tf=TransformerFactory.newInstance(); 
    		Transformer transformer=tf.newTransformer(); 
    		DOMSource source=new DOMSource(doc); 
    		transformer.setOutputProperty(OutputKeys.ENCODING,charset); 
    		transformer.setOutputProperty(OutputKeys.INDENT,"yes"); 
       		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
    		transformer.setOutputProperty(OutputKeys.MEDIA_TYPE, "text/xml");
    		if(this.cdata_field.length() > 0)
    			transformer.setOutputProperty(OutputKeys.CDATA_SECTION_ELEMENTS, cdata_field);
    		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
    		StreamResult result=new StreamResult(ostream); 
    		transformer.transform(source,result); 
    		ostream.close();
			/*
			OutputStreamWriter outWriter = new OutputStreamWriter(ostream); 
			((XmlDocument) doc).write(outWriter,charset); 
			outWriter.close();*/
		}
		catch(Exception e){e.printStackTrace();}
	}
	
    //将写入的内容保存到文件
    public boolean flush(String fname,String charset){
        boolean written = true;
        if(charset == null) charset = "gb2312";
        try{
        		TransformerFactory tf=TransformerFactory.newInstance(); 
        		Transformer transformer=tf.newTransformer(); 
        		DOMSource source=new DOMSource(doc); 
        		transformer.setOutputProperty(OutputKeys.ENCODING,charset); 
        		transformer.setOutputProperty(OutputKeys.INDENT,"yes"); 
        		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        		transformer.setOutputProperty(OutputKeys.MEDIA_TYPE, "text/xml");
        		if(this.cdata_field.length() > 0)
        			transformer.setOutputProperty(OutputKeys.CDATA_SECTION_ELEMENTS, cdata_field);
        		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
        		FileOutputStream fos = new FileOutputStream(fname);
        		StreamResult result=new StreamResult(fos); 
        		transformer.transform(source,result); 
        		fos.close();
/*        	
        	
            //判断fname是否存在，如已存在，需要先删除之
            File f = new File(fname);
            if(f.exists())f.delete();       
            if(!opening)return false;
        
            //把XML文档输出到指定的文件 
            FileOutputStream outStream = new FileOutputStream(fname); 
            OutputStreamWriter outWriter = new OutputStreamWriter(outStream); 
            ((XmlDocument) doc).write(outWriter,charset); 
            outWriter.close(); 
            outStream.close();      */
        }
        catch(Exception e)
        {
            e.printStackTrace();
            written = false;
        }
        return written;
    }
    
    //将写入的内容输出到流
    public boolean flush(java.io.OutputStream oStream,String charset){
        boolean written = true;
        if(charset == null) charset = "gb2312";
        try{
            if(!opening)return false;

    		TransformerFactory tf=TransformerFactory.newInstance(); 
    		Transformer transformer=tf.newTransformer(); 
    		DOMSource source=new DOMSource(doc); 
    		transformer.setOutputProperty(OutputKeys.ENCODING,charset); 
    		transformer.setOutputProperty(OutputKeys.INDENT,"yes"); 
    		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
    		transformer.setOutputProperty(OutputKeys.MEDIA_TYPE, "text/xml");
    		if(this.cdata_field.length() > 0)
    			transformer.setOutputProperty(OutputKeys.CDATA_SECTION_ELEMENTS, cdata_field);
    		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
    		StreamResult result=new StreamResult(oStream); 
    		transformer.transform(source,result); 
    		oStream.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
            written = false;
        }
        return written;
    }
  //将写入的内容输出到字符串流
    public String flush(String charset){
    	String sResult = "";
    	java.io.ByteArrayOutputStream  oStream = new java.io.ByteArrayOutputStream();
        if(charset == null) charset = "utf-8";
        try{
            if(!opening)return sResult;

    		TransformerFactory tf=TransformerFactory.newInstance(); 
    		Transformer transformer=tf.newTransformer(); 
    		DOMSource source=new DOMSource(doc); 
    		transformer.setOutputProperty(OutputKeys.ENCODING,charset); 
    		transformer.setOutputProperty(OutputKeys.INDENT,"yes"); 
    		transformer.setOutputProperty(OutputKeys.METHOD, "xml");
    		transformer.setOutputProperty(OutputKeys.MEDIA_TYPE, "text/xml");
    		if(this.cdata_field.length() > 0)
    			transformer.setOutputProperty(OutputKeys.CDATA_SECTION_ELEMENTS, cdata_field);
    		transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
    		StreamResult result=new StreamResult(oStream); 
    		transformer.transform(source,result);
    		sResult = new String(oStream.toByteArray(),charset);
    		oStream.close();    		
        }
        catch(Exception e)
        {
            e.printStackTrace();
         }
        return sResult;
    }	
	
    public String flush() throws TransformerException
    {
    	TransformerFactory tf = TransformerFactory.newInstance();
    	Transformer t = tf.newTransformer();
    	t.setOutputProperty("encoding","GBK");//解决中文问题，试过用GBK不行
    	ByteArrayOutputStream bos = new ByteArrayOutputStream();
    	t.transform(new DOMSource(doc), new StreamResult(bos));
    	String xmlStr = bos.toString();
    	return xmlStr;
    }
    
}
