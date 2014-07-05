package operation;

import java.util.List;

public interface I_Find<T> {
	T findById(Object id);
	List<T> findBycolumn(String column,Object value);
	List<T> findAll();
}
