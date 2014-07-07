package operation;

import java.util.List;

import database.User;
import database.UserDAO;
import database.Viewer;

//To focus the user
public class FindUser<T> implements I_Find<User>{
	UserDAO udao=new UserDAO();

	public User findById(Object id) {//通过主键查找
		return udao.findById(id+"");
	}

	public List<User> findBycolumn(String column,Object value) {//通过某一列来查找
		List<User> users=null;
		switch(column.toLowerCase().hashCode()){//将该列转换为小写，并转换为唯一的哈希码
		case 3373707:users=udao.findByUName(value);break;//name
		case 3575610:users=udao.findByUType(value);break;//type
		case -1249512767:users=udao.findByUGender(value);break;//gender
		}
		return users;
	}

	public List<User> findAll() {//通过全部列来查找
		return udao.findAll();
	}

	public List<Viewer> findBycolumns(String[] columns, String[] values) {//通过多列来查找
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("users");//传递表格名称users
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
	
}
