package operation;

import java.util.List;

import database.User;
import database.UserDAO;
public class FindUser implements I_Find{
	User user=null;
	UserDAO udao=new UserDAO();

	public Object findById(Object id) {
		user=udao.findById(id+"");
		return user;
	}

	public List findBycolumn(String column,Object value) {
		List users=null;
		switch(column.toLowerCase().hashCode()){
		case 3373707:users=udao.findByUName(value);break;//name
		case 3575610:users=udao.findByUType(value);break;//type
		case -1249512767:users=udao.findByUGender(value);break;//gender
		}
		return users;
	}

	public List findAll() {
		return udao.findAll();
	}
	
}
