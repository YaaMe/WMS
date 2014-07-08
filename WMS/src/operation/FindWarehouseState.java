package operation;

import java.util.List;

import support.GetSQL;
import support.RunSQL;

import database.Cargomoving;
import database.Viewer;
import database.Warehousestate;
import database.WarehousestateDAO;
import database.WarehousestateId;

//To show the state of Warehouse
public class FindWarehouseState<T> implements I_Find<Warehousestate>{
	RunSQL runsql=new RunSQL();
	Turn turn=new Turn();
	String sql="";
	public List<Warehousestate> findAll() {
		sql="select * from warehousestate;";
		return turn.turnToWarehousestate(runsql.selectSQL(sql));
	}
	public Warehousestate findById(Object id) {
		WarehousestateId houseid=(WarehousestateId)id;
		sql="select * from cargo where cargo_area="+houseid.getCargoArea()+" cargo_row="+houseid.getCargoRow()
			+" cargo_shelf="+houseid.getCargoShelf()+" cargo_seat="+houseid.getCargoSeat()+";";
		return turn.turnToWarehousestate(runsql.selectSQL(sql).get(0));
	}
	public List<Warehousestate> findBycolumn(String column, Object value) {
		sql="select * from warehousestate where "+column+"="+value+";";
		return turn.turnToWarehousestate(runsql.selectSQL(sql));
	}
	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		GetSQL getsql=new GetSQL("warehousestate");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
