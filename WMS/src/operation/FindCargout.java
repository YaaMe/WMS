package operation;

import java.util.List;

import database.Cargoin;
import database.Cargout;
import database.CargoutDAO;
import database.Viewer;

public class FindCargout<T> implements I_Find<Cargout>{
	CargoutDAO cdao=new CargoutDAO();
	public List<Cargout> findAll() {
		return cdao.findAll();
	}

	public Cargout findById(Object id) {
		return cdao.findById(id+"");
	}

	public List<Cargout> findBycolumn(String column, Object value) {
		List<Cargout> cargos=null;
		switch(column.toLowerCase().hashCode()){
		case 1168988856:cargos=cdao.findByCargoOuterid(value);break;//outerid
		case 399098768:cargos=cdao.findByCargoCheckerid(value);break;//checkerid
		}
		return cargos;
	}

	public List<Viewer> findBycolumns(String[] columns, String[] values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargout");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
