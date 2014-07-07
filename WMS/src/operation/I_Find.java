package operation;

import java.util.List;

import database.Viewer;

public interface I_Find<T> {
	T findById(Object id);//������������
	List<Viewer> findBycolumns(List<String> columns,List<String> values);//����������
	List<T> findBycolumn(String column,Object value);//����������
	List<T> findAll();//ͨ�������в���
}
