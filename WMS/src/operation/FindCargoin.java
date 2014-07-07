package operation;

import java.util.List;

import database.Cargo;
import database.Cargoin;
import database.CargoinDAO;
import database.Viewer;

public class FindCargoin<T> implements I_Find<Cargoin>{
	CargoinDAO cdao=new CargoinDAO();

	public List<Cargoin> findAll() {
		return cdao.findAll();
	}

	public Cargoin findById(Object id) {
		return cdao.findById(id+"");
	}

	public List<Cargoin> findBycolumn(String column, Object value) {
		List<Cargoin> cargos=null;
		switch(column.toLowerCase().hashCode()){
		case 1168988856:cargos=cdao.findByCargoTrackingno(value);break;//trackingno
		case 399098768:cargos=cdao.findByCargoCheckerid(value);break;//checkerid
		case -1184197331:cargos=cdao.findByCargoInerid(value);break;//inerid
		}
		return cargos;
	}

	public List<Viewer> findBycolumns(String[] columns, String[] values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargoin");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
}
