package operation;

import java.util.List;

public interface I_Find {
	Object findById(Object id);
	List findBycolumn(String column,Object value);
	List findAll();
}
