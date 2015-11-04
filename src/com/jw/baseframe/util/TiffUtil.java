package com.jw.baseframe.util;

import java.awt.image.RenderedImage;   
import java.io.*;   
import com.sun.media.jai.codec.*;  
//import com.sun.media.jai.util.SimpleCMYKColorSpace;

public class TiffUtil {
  
	   public static final String TIFF = "TIFF";   
	   public static final String JPEG = "JPEG";   
	  
	   public static int getTotalPageNumber(File file)   
	           throws IOException   
	   {   
	       SeekableStream seekableStream = new FileSeekableStream(file);   
	       TIFFDecodeParam param = new TIFFDecodeParam();   
	       ImageDecoder dec = ImageCodec.createImageDecoder(TIFF, seekableStream, param);   
	       return dec.getNumPages();   
	   }   
	   
	   public static int getTotalPageNumber(File file,String pix)   
       throws IOException   
       {   
		   SeekableStream seekableStream = new FileSeekableStream(file);   
		   TIFFDecodeParam param = new TIFFDecodeParam();   
		   ImageDecoder dec = ImageCodec.createImageDecoder(pix, seekableStream, param);   
		   return dec.getNumPages();   
       }   
	  
	   /**  
	    * 获取tiff文件中的某页的图像，页号从1开始  
	    *  
	    * @param tiffInputStream tiff输入流  
	    * @param pageNum tiff文件中的某页号，从1开始  
	    * @return tiff中的某页图象  
	    * @throws IOException;  
	    */  
	   public static RenderedImage getSinglePageRenderImage(InputStream tiffInputStream, int pageNum)   
	           throws IOException   
	   {   
	       int page = pageNum - 1;   
	       TIFFDecodeParam param = new TIFFDecodeParam();   
	       ImageDecoder dec = ImageCodec.createImageDecoder(TIFF, tiffInputStream, param);   
	       int numPages = dec.getNumPages();   
	       if (page < 0 || page >= numPages) {   
	           throw new IndexOutOfBoundsException();   
	       }   
	       return dec.decodeAsRenderedImage(page);   
	   }   
	  
	   /**  
	    * 获取tiff文件中的某页的图像，页号从0开始  
	    *  
	    * @param file tiff文件  
	    * @param pageNum tiff文件中的某页号，从0开始  
	    * @return tiff中的某页图象  
	    * @throws IOException;  
	    */  
	   public static RenderedImage getSinglePageRenderImage(File file, int pageNum)   
	           throws IOException   
	   {   
	       int page = pageNum;   
	       TIFFDecodeParam param = new TIFFDecodeParam();   
	       ImageDecoder dec = ImageCodec.createImageDecoder(TIFF, file, param);   
	       int numPages = dec.getNumPages();
	       //System.out.println("page:"+page);
	       if (page < 0 || page >= numPages) {   
	           throw new IndexOutOfBoundsException();   
	       }   
	       return dec.decodeAsRenderedImage(page);   
	   }   
	  	
	   public static void main(String[] args)   	
	           throws IOException   	
	   {   	
	       File file = new File("h:/aaa.tiff");   	
	       int numPages = getTotalPageNumber(file);	
	       for(int i=0;i<numPages;i++)	
	       {	
	    	   RenderedImage image = TiffUtil.getSinglePageRenderImage(file, i);   
	    	   JPEGEncodeParam param = new JPEGEncodeParam();   
	    	   param.setQuality(0.075f);   
	    	   try {   
	           OutputStream os = new FileOutputStream("h:/aaa-"+(i+1)+".jpg");   	
	           ImageEncoder imageEncoder = ImageCodec.createImageEncoder(JPEG, os, param);   	
	           imageEncoder.encode(image);   	
	           os.close();   	
	    	   }   	
	    	   catch (Exception e) {   	
	    		   e.printStackTrace();   
	    	   }   	
	       }		
	   }   		

	   public static void t2j1()   		
	           throws IOException   		
	   {   		
	   	 File file = new File("d:/pic/aaa.tiff");   	
	       int numPages = getTotalPageNumber(file);		
	       for(int i=0;i<numPages;i++)		
	       {		
	    	   RenderedImage image = TiffUtil.getSinglePageRenderImage(file, i);   	
	    	   JPEGEncodeParam param = new JPEGEncodeParam();   	
	    	   param.setQuality(0.075f);   	
	    	   try {   	
	           OutputStream os = new FileOutputStream("d:/pic/aaa-"+(i+1)+".jpg");   		
	           ImageEncoder imageEncoder = ImageCodec.createImageEncoder(JPEG, os, param);   		
	           imageEncoder.encode(image);   		
	           os.close();   		
	    	   }   	
	    	   catch (Exception e) {   	
	    		   e.printStackTrace();   
	    	   }   	
	       }		
	   	}	
	   		
	   public static int t2j(String tiffPath,String savePath)   		
	           throws IOException   		
	   {   		
	   	  File file = new File(tiffPath);		
	   	  String picName;		
	       int numPages = getTotalPageNumber(file);			
	       for(int i=0;i<numPages;i++)			
	       {			
	    	   RenderedImage image = TiffUtil.getSinglePageRenderImage(file, i);   		
	    	   JPEGEncodeParam param = new JPEGEncodeParam();   		
	    	   param.setQuality(0.075f);   		
	    	   try {  		
	    	   	 picName = String.valueOf(i+1);	
	    	   	 if(picName.length() == 1)	
	    	   	 	picName = "00"+picName;
	    	   	 else if(picName.length() == 2)	
	    	   	 	picName = "0"+picName;
	    	   	 else	
	    	   	 	picName = picName;
	    	   	 picName = "evermore"+picName+".jpg";
	           OutputStream os = new FileOutputStream(savePath+picName);   		
	           ImageEncoder imageEncoder = ImageCodec.createImageEncoder(JPEG, os, param);   		
	           imageEncoder.encode(image);   		
	           os.close();   		
	    	   }   	
	    	   catch (Exception e) {   	
	    		   e.printStackTrace();   
	    	   }   	
	       }		
	       return numPages;		
	}		

}
