package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.*;
//To find tble Cargo
public class FindCargo<T> implements I_Find<Cargo>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Cargo> findAll() {
		sql="select * from cargo;";
		return turn.turnToCargo(runsql.selectSQL(sql));
	}
	public Cargo findById(Object id) {
		sql="select * from cargo where cargo_trackingno="+id+";";
		return turn.turnToCargo(runsql.selectSQL(sql).get(0));
	}
	public List<Cargo> findBycolumn(String column, Object value) {
		sql="select * from cargo where "+column+"="+value+";";
		return turn.turnToCargo(runsql.selectSQL(sql));
	}
	public List<Viewer> findBycolumns(List<String> columns,List<String> values){
		GetSQL getsql=new GetSQL("cargo");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
}
