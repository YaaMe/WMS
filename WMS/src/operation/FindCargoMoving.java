package operation;

import java.util.List;
import database.*;
public class FindCargoMoving implements I_Find<Cargomoving>{
	Cargomoving cmov=null;
	CargomovingDAO cmovdao=new CargomovingDAO();
	public List<Cargomoving> findAll() {
		List<Cargomoving> findAll = cmovdao.findAll();
		return findAll;
	}
	public Cargomoving findById(Object id) {
		return cmovdao.findById(Integer.parseInt(id+""));
	}
	public List<Cargomoving> findBycolumn(String column, Object value) {
		List<Cargomoving> cmovs=null;
		switch(column.toLowerCase().hashCode()){
		case 3355:cmovs=cmovdao.findByCargoId(value);break;//id
		}
		return cmovs;
	}
	public List<Viewer> findBycolumns(String[] columns, String[] values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargomoving");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
