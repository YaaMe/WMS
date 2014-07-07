package operation;

import java.util.List;

import database.*;

public class FindCargo<T> implements I_Find<Cargo>{
	CargoDAO cdao=new CargoDAO();
	public List<Cargo> findAll() {
		return cdao.findAll();
	}
	public Cargo findById(Object id) {
		return cdao.findById(id+"");
	}
	public List<Cargo> findBycolumn(String column, Object value) {
		List<Cargo> cargos=null;
		switch(column.toLowerCase().hashCode()){
		case -1008619738:cargos=cdao.findByCargoOrigin(value);break;//origin
		case -1429847026:cargos=cdao.findByCargoDestination(value);break;//destination
		}
		return cargos;
	}
	public List<Viewer> findBycolumns(String[] columns,String[] values){
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargo");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}
}
