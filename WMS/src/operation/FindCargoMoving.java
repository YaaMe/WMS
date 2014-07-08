package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;
import database.*;
//To find table cargomoving
public class FindCargoMoving<T> implements I_Find<Cargomoving>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Cargomoving> findAll() {
		sql="select * from cargomoving;";
		return turn.turnToCargomoving(runsql.selectSQL(sql));
	}
	public Cargomoving findById(Object id) {
		sql="select * from cargomoving where movid="+id+";";
		return turn.turnToCargomoving(runsql.selectSQL(sql).get(0));
	}
	public List<Cargomoving> findBycolumn(String column, Object value) {
		sql="select * from cargomoving where "+column+"="+value+";";
		return turn.turnToCargomoving(runsql.selectSQL(sql));
	}
	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		GetSQL getsql=new GetSQL("cargomoving");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
