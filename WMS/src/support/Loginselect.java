package support;

import database.User;
import operation.Find;

//select next JSP after login
public class Loginselect {
	String jsp="login.jsp";
	Find<User> find=new Find<User>("user");
	User user=null;
	public Loginselect(String id){
		user=(User) find.findById(id);
		jsp=user.getUType()=="admin"?"admin.jsp":"checker.jsp";
	}
	public String getNext(){
		return jsp;
	}
}
