package operation;

import java.util.List;

import database.User;
import database.UserDAO;
import database.Viewer;

//To focus the user
public class FindUser<T> implements I_Find<User>{
	UserDAO udao=new UserDAO();

	public User findById(Object id) {//ͨ����������
		return udao.findById(id+"");
	}

	public List<User> findBycolumn(String column,Object value) {//ͨ��ĳһ��������
		List<User> users=null;
		switch(column.toLowerCase().hashCode()){//������ת��ΪСд����ת��ΪΨһ�Ĺ�ϣ��
		case 3373707:users=udao.findByUName(value);break;//name
		case 3575610:users=udao.findByUType(value);break;//type
		case -1249512767:users=udao.findByUGender(value);break;//gender
		}
		return users;
	}

	public List<User> findAll() {//ͨ��ȫ����������
		return udao.findAll();
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {//ͨ������������
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("users");//���ݱ������users
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
	
}
