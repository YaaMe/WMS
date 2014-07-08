package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.Cargoin;
import database.Cargout;
import database.CargoutDAO;
import database.Viewer;
//To find table cargout
public class FindCargout<T> implements I_Find<Cargout>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Cargout> findAll() {
		sql="select * from cargout;";
		return turn.turnToCargout(runsql.selectSQL(sql));
	}

	public Cargout findById(Object id) {
		sql="select * from cargout where cargo_id="+id+";";
		return turn.turnToCargout(runsql.selectSQL(sql).get(0));
	}

	public List<Cargout> findBycolumn(String column, Object value) {
		sql="select * from cargout where "+column+"="+value+";";
		return turn.turnToCargout(runsql.selectSQL(sql));
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargout");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
