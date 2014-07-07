package operation;

import java.util.List;

import database.Cargo;
import database.Cargorecord;
import database.CargorecordDAO;
import database.Viewer;

public class FindCargoRecord<T> implements I_Find<Cargorecord>{
	CargorecordDAO cdao=new CargorecordDAO();
	public List<Cargorecord> findAll() {
		return cdao.findAll();
	}

	public Cargorecord findById(Object id) {
		return cdao.findById(id+"");
	}

	public List<Cargorecord> findBycolumn(String column, Object value) {
		List<Cargorecord> records=null;
		switch(column.toLowerCase().hashCode()){
		case 3002509:records=cdao.findByCargoArea(value);break;//area
		case 113114:records=cdao.findByCargoRow(value);break;//row
		case 109403690:records=cdao.findByCargoShelf(value);break;//shelf
		case 3526149:records=cdao.findByCargoSeat(value);break;//seat
		case -223321008:records=cdao.findByCargoBemoved(value);break;//bemoved
		case 109757585:records=cdao.findByCargoState(value);break;//state
		}
		return records;
	}

	public List<Viewer> findBycolumns(List<String> columns, List<String> values) {
		RunSQL runsql=new RunSQL();
		GetSQL getsql=new GetSQL("cargorecord");
		String sql=getsql.columnsLimit(columns, values);
		return runsql.selectSQL(sql);
	}

}
