package com.jw.magicbpm.action.personalaffairs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;




public class ActivityByPersondoSql {
	Connection conn = null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	@SuppressWarnings("unchecked")
	List<Map> list=null;
	/**
	 * 数据库连接
	 * @param sqlSession
	 */
	public ActivityByPersondoSql(SqlSession sqlSession) {
		
		try {
		    conn = sqlSession.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/**
	 * 执行插入或更新操作sql文
	 * @param sql
	 * @param parameter
	 * @throws SQLException
	 */
	public void doExcute(String sql,String ...parameter){
		try {
			this.ps=this.conn.prepareStatement(sql);
			for(int i=0;i<parameter.length;i++){
				this.ps.setString(i+1, parameter[i]);
			}
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 执行查询
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws SQLException
	 */
	@SuppressWarnings("unchecked")
	public List<Map> doQuery(String sql,String ...parameter) throws SQLException{
		this.ps=this.conn.prepareStatement(sql);
		for(int i=0;i<parameter.length;i++){
			this.ps.setString(i+1, parameter[i]);
		}
		this.rs=this.ps.executeQuery();
		
		ResultSetMetaData md = rs.getMetaData();
		int num = md.getColumnCount();

		list=new ArrayList<Map>();
		while(rs.next()){
			Map mapOfColValues = new HashMap();
			for (int i = 1; i <= num; i++) {
				if(rs.getObject(i)==null){
					continue;
				}
				mapOfColValues.put(md.getColumnName(i),"'"+rs.getObject(i).toString()+"'" );
				}
				list.add(mapOfColValues);
		}
		return list;
	}
	
	/**
	 * 关闭连接
	 */
	public void closeConn(){
		try {
			if(rs!=null){
			this.rs.close();}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.rs=null;
			try {
				if(ps!=null){
				this.ps.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.ps=null;
			}
		}
	}
}
