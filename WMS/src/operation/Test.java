package operation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import database.*;

public class Test {
	public static void main(String[] args) throws SQLException {
//		Find<Viewer> find = new Find<Viewer>("users");
//		List<Viewer> list=find.findAll();
//		System.out.println(list.get(0).getColumn(0));
//		System.out.println(list.get(0).getColumnName(0));
//		System.out.println(list.get(0).getColumnName().length);
//		CreateXLS cre=new CreateXLS("users");
		//String[][] str={{"c1","c2","c3"},{"1","2","3"}};		
//		cre.create(list);
//		String[] column={"u_type","u_gender"};
//		String[] values={"admin","Ů"};
//		List<Viewer> data=find.findBycolumns(column, values);
//		for(int i=0;i<data.size();i++,System.out.println())
//			for(int j=0;j<data.get(i).getColumnCounts();j++)
//				System.out.print(data.get(i).getColumn(j)+"||");
//		Find<User> find=new Find<User>("user");
//		User user=find.findById("00120110327");
//		List<User> users=find.findAll();
//		System.out.print(user.getUName());
//		GetSQL getsql=new GetSQL("users");
//		String[] column={"u_name","u_gender"};
//		String[] values={"aaa","male"};
//		System.out.println(getsql.columnsLimit(column, values));
		
//		Find<Viewer> find = new Find<Viewer>("warehousestate");
//
//		List<Viewer> data=find.findBycolumn("cargo_area", "A1");
//		System.out.println(data.size());
//		String sql="select * from users;";
//
//				RunSQL runner=new RunSQL();
//		List<Viewer> data=runner.selectSQL(sql);
//		
//		System.out.println("success:"+data.get(0).toString());
//		Find<Viewer> find=new Find<Viewer>("users");
//		List<Viewer> da=find.findBycolumn("u_id", "00120110327");
//		System.out.println(da.get(0).getColumn(3));
		
//		Test test=new Test();
//		System.out.println(test.SQL('B', 2, 3, 4, 20));
		System.out.println("cargo_mov".hashCode());
//		System.out.println("cargo".hashCode());
	}
	public String SQL(char b,int alimit,int rows,int shelfs,int seats){
		String sql="";
		char a='A';
		String area="",row="",shelf="",seat="";
		while(a<=b){
			for(int areaid=1;areaid<alimit;areaid++){
				area=a+""+areaid;
				for(int rowid=1;rowid<=rows;rowid++){
					row=rowid+"";
					for(int shelfid=1;shelfid<=shelfs;shelfid++){
						shelf=area+"R0"+shelfid+"-"+rows+"-0"+seats;
						for(int seatid=1;seatid<=seats;seatid++){
							sql+=oneSQL(area,row,shelf,seatid);
							sql+="\n";
						}
					}
				}
			}

			a++;	
		}
		return sql;
	}
	public String oneSQL(String area,String row,String shelf,int seat){
		return "insert into Warehousestate values("+"'"+area+"',"+"'"+row+"',"+"'"+shelf+"',"+"'"+seat+"','');";
	}
}
