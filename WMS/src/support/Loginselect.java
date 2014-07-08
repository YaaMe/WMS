package support;

import database.User;
import operation.Find;

//select next JSP after login
public class Loginselect {
	String jsp="../polymer-tutorial-master/step-1/index.html";
	Find<User> find=new Find<User>("user");
	User user=null;
	public Loginselect(String id){
		user=find.findById(id);
		jsp=user.getUType()=="admin"?"../../WebRoot/polymer-tutorial-master/step-1/admin.jsp":"../../WebRoot/polymer-tutorial-master/step-1/checker.jsp";
	}
	public String getNext(){
		System.out.println(jsp);
		return jsp;
	}
	
}
