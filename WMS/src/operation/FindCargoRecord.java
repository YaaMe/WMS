package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.Cargo;
import database.Cargomoving;
import database.Cargorecord;
import database.CargorecordDAO;
import database.Viewer;
//To find table cargorecord
public class FindCargoRecord<T> implements I_Find<Cargorecord>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Cargorecord> findAll() {
		sql="select * from cargorecord;";
		return turn.turnToCargorecord(runsql.selectSQL(sql));
	}

	public Cargorecord findById(Object id) {
		sql="select * from cargorecord where cargo_id="+id+";";
		return turn.turnToCargorecord(runsql.selectSQL(sql).get(0));
	}

	public List<Cargorecord> findBycolumn(String column, Object value) {
		sql="select * from cargorecord where "+column+"="+value+";";
		return turn.turnToCargorecord(runsql.selectSQL(sql));
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		GetSQL getsql=new GetSQL("cargorecord");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
