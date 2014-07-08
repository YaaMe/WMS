package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.Cargo;
import database.Cargoin;
import database.CargoinDAO;
import database.Viewer;
//To find table cargoin
public class FindCargoin<T> implements I_Find<Cargoin>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Cargoin> findAll() {
		sql="select * from cargoin;";
		return turn.turnToCargoin(runsql.selectSQL(sql));
	}
	public Cargoin findById(Object id) {
		sql="select * from cargoin where cargo_id="+id+";";
		return turn.turnToCargoin(runsql.selectSQL(sql).get(0));
	}
	public List<Cargoin> findBycolumn(String column, Object value) {
		sql="select * from cargoin where "+column+"="+value+";";
		return turn.turnToCargoin(runsql.selectSQL(sql));
	}
	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		GetSQL getsql=new GetSQL("cargoin");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
}
