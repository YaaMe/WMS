package operation;

import java.util.List;

import database.User;
import database.UserDAO;

//To focus the user
public class FindUser<T> implements I_Find<User>{
	UserDAO udao=new UserDAO();

	public User findById(Object id) {
		return udao.findById(id+"");
	}

	public List<User> findBycolumn(String column,Object value) {
		List<User> users=null;
		switch(column.toLowerCase().hashCode()){
		case 3373707:users=udao.findByUName(value);break;//name
		case 3575610:users=udao.findByUType(value);break;//type
		case -1249512767:users=udao.findByUGender(value);break;//gender
		}
		return users;
	}

	public List<User> findAll() {
		return udao.findAll();
	}
	
}
