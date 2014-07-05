package operation;

import java.sql.*;

public class RunSQL {
	String name="YaaMe",
		   password="qclis235791468",
		   jdbc="jdbc:sqlserver://localhost:1433;",
		   driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public RunSQL(){}
	public RunSQL(String name,String password){
		this.name=name;this.password=password;
	}
	public RunSQL(String driver,String jdbc,String name,String password){
		this.driver=driver;this.jdbc=jdbc;this.name=name;this.password=password;
	}
	
	public ResultSet selectSQL(String sql){
		Connection con = null;  
        Statement stmt = null;  
        ResultSet rs = null;
        try {  
            Class.forName(driver);  
            con = DriverManager.getConnection(jdbc, name,password);  
            stmt = con.createStatement();
            rs=stmt.executeQuery(sql);
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
        return rs;
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
//           stmt.executeUpdate(sql);  
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
