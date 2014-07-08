package operation;

import java.util.ArrayList;
import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.User;
import database.UserDAO;
import database.Viewer;

//To focus the user
public class FindUser<T> implements I_Find<User>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public User findById(Object id) {//通过主键查找
		sql="select * from users where u_id="+id+";";
		return turn.turnToUser(runsql.selectSQL(sql).get(0));
	}

	public List<User> findBycolumn(String column,Object value) {//通过某一列来查找
		sql="select * from users where "+column+"="+value+";";
		return turn.turnToUser(runsql.selectSQL(sql));

	}

	public List<User> findAll() {//通过全部列来查找
		sql="select * from users;";
		return turn.turnToUser(runsql.selectSQL(sql));
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {//通过多列来查找
		GetSQL getsql=new GetSQL("users");//传递表格名称users
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
	
}
