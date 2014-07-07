package operation;

import java.util.List;

import database.Viewer;

public interface I_Find<T> {
	T findById(Object id);//根据主键查找
	List<Viewer> findBycolumns(List<String> columns,List<String> values);//多条件查找
	List<T> findBycolumn(String column,Object value);//单条件查找
	List<T> findAll();//通过所有列查找
}
