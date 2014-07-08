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
	public User findById(Object id) {//ͨ����������
		sql="select * from users where u_id="+id+";";
		return turn.turnToUser(runsql.selectSQL(sql).get(0));
	}

	public List<User> findBycolumn(String column,Object value) {//ͨ��ĳһ��������
		sql="select * from users where "+column+"="+value+";";
		return turn.turnToUser(runsql.selectSQL(sql));

	}

	public List<User> findAll() {//ͨ��ȫ����������
		sql="select * from users;";
		return turn.turnToUser(runsql.selectSQL(sql));
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {//ͨ������������
		GetSQL getsql=new GetSQL("users");//���ݱ������users
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
	
}
