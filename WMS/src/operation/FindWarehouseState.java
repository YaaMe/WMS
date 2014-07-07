package operation;

import java.util.List;

import database.Cargomoving;
import database.Viewer;
import database.Warehousestate;
import database.WarehousestateDAO;
import database.WarehousestateId;


public class FindWarehouseState<T> implements I_Find<Warehousestate>{
	WarehousestateDAO house=new WarehousestateDAO();
	public List<Warehousestate> findAll() {
		return house.findAll();
	}

	public Warehousestate findById(Object id) {
		WarehousestateId houseid=(WarehousestateId)id;
		return house.findById(houseid);
	}

	public List<Warehousestate> findBycolumn(String column, Object value) {
		List<Warehousestate> houses=null;
		switch(column.toLowerCase().hashCode()){
		case 554038743:houses=house.findByCargoId(value);break;//cargoid
		}
		return houses;
	}

	public List<Viewer> findBycolumns(String[] columns, String[] values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("warehousestate");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
