package support;

import operation.Find;
import database.User;
//Judge the id can login or not
public class LoginIllgal {
	public boolean isIllgal(String id,String password){
		boolean illgal=false;
		Find<User> find=new Find<User>("user");
		User user=null;
		user=find.findById(id);
		if(user!=null&&user.getUPassword().equals(password))
			illgal=true;
		return illgal;		
	}
}
