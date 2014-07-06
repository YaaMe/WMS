package operation;

import java.sql.*;
import java.util.*;

import database.Viewer;

//running sql by jdbc,return in List
public class RunSQL {
	String name="YaaMe",
		   password="qclis235791468",
		   jdbc="jdbc:sqlserver://localhost:1433;DatabaseName=WMS",
		   driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public RunSQL(){}
	public RunSQL(String name,String password){
		this.name=name;this.password=password;
	}
	public RunSQL(String driver,String jdbc,String name,String password){
		this.driver=driver;this.jdbc=jdbc;this.name=name;this.password=password;
	}
	
	public List<Viewer> selectSQL(String sql){
		Connection con = null;  
        Statement stmt = null;  
        ResultSet rs = null;
        Viewer entity;
        List<Viewer> data=new ArrayList<Viewer>();
        try {  
            Class.forName(driver);  
            con = DriverManager.getConnection(jdbc, name,password);  
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery(sql);
            entity=new Viewer(rs.getMetaData().getColumnCount());
		    while(rs.next()){
		    	for(int i=0;i<rs.getMetaData().getColumnCount();i++){
		    		entity.setColumn(i,rs.getString(i+1));
	            }
		    	data.add(entity);
		    }
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException s) {  
            s.printStackTrace();  
        } finally {  
            try {  
                if (rs != null) {  
                    rs.close();  
                    rs = null;  
                }  
                if (stmt != null) {  
                    stmt.close();  
                    stmt = null;  
                }  
                if (con != null) {  
                    con.close();  
                    con = null;  
                }  
            } catch (SQLException se) { 
                se.printStackTrace();  
            }
        }
        return data;
	}
	public int insertSQL(String sql){
		Connection con = null;  
        Statement stmt = null;  
        ResultSet rs = null;
        int num=0;
        try {  
            Class.forName(driver);  
            con = DriverManager.getConnection(jdbc, name,password);  
            stmt = con.createStatement();
            num=stmt.executeUpdate(sql);
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        } catch (SQLException s) {  
            s.printStackTrace();  
        } finally {  
            try {  
                if (rs != null) {  
                    rs.close();  
                    rs = null;  
                }  
                if (stmt != null) {  
                    stmt.close();  
                    stmt = null;  
                }  
                if (con != null) {  
                    con.close();  
                    con = null;  
                }  
            } catch (SQLException se) { 
                se.printStackTrace();  
            }
        }
        return num;
	}
}
