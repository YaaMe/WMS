package operation;

import java.util.List;

import database.Viewer;
//maintenance of Find operation
public class Find<T> implements I_Find<T>{
	private I_Find<T> find=null;
	public Find(String type){
		switch(type.toLowerCase().hashCode()){//将类型转换成小写，并转换成哈希码。每一个字符串只能对应一个哈希码，而一个哈希码则可能对应多个字符串。
		case 3599307 :find=new FindUser();break;//user
		case 94431164:find=new FindCargo();break;//cargo
		case -1997587773:find=new FindWarehouseState();break;//warehouse
		case 1223726644:find=new FindCargoRecord();break;//cargo_record
		case -144998383:find=new FindCargoMoving();break;//cargo_mov
		case -4677496:find=new FindCargoin();break;//cargo_in
		case -144996277:find=new FindCargout();break;//cargo_out
		default:find=new FindView(type.toLowerCase());break;
		}
	}
	//find by id,Object is ready for unique id
	public T findById(Object id) {
		return find.findById(id);
	}
	//find by one of some column
	public List<T> findBycolumn(String column,Object value) {
		return find.findBycolumn(column,value);
	}
	//get all
	public List<T> findAll() {
		return find.findAll();
	}
	//unique limit
	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		return find.findBycolumns(columns, values);
	}
}
