package jspselector;

import database.User;
import operation.Find;

//select next JSP after login
public class Loginselect {
	String jsp="login.jsp";
	Find find=new Find("user");
	User user=null;
	public Loginselect(String id){
		user=(User) find.findById(id);
		jsp=user.getUType()=="admin"?"admin.jsp":"checker.jsp";
	}
	public String getNext(){
		return jsp;
	}
}
