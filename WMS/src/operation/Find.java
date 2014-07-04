package operation;

import java.util.List;

public class Find implements I_Find{
	I_Find find=null;
	public Find(String type){
		switch(type.toLowerCase().hashCode()){
		case 3599307 :find=new FindUser();break;
		}
	}
	public Object findById(Object id) {
		return find.findById(id);
	}
	public List findBycolumn(String column,Object value) {
		return find.findBycolumn(column,value);
	}
	public List findAll() {
		return find.findAll();
	}
}
