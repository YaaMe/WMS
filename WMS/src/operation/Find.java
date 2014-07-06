package operation;

import java.util.List;
//maintenance of Find operation
public class Find<T> implements I_Find<T>{
	I_Find<T> find=null;
	public Find(String type){
		switch(type.toLowerCase().hashCode()){
		case 3599307 :find=new FindUser();break;//user
		case 94431164:find=new FindCargo();break;//cargo
		case 13683630:find=new FindWarehouseState();break;//warehousestate
		default:find=new FindView(type.toLowerCase());break;
		}
	}
	public T findById(Object id) {
		return find.findById(id);
	}
	public List<T> findBycolumn(String column,Object value) {
		return find.findBycolumn(column,value);
	}
	public List<T> findAll() {
		return find.findAll();
	}
}
