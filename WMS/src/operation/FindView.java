package operation;

import java.util.ArrayList;
import java.util.List;

import database.Viewer;

//To get data of view or some table;
public class FindView<T> implements I_Find<Viewer> {
	RunSQL runsql=new RunSQL();
	String table=null;
	String sql="";
    FindView(String table){
    	this.table=table;
    }
	public List<Viewer> findAll() {
	    sql="select * from "+table+";";
		return runsql.selectSQL(sql);
	}

	public Viewer findById(Object id) {
		return null;
	}

	public List<Viewer> findBycolumn(String column, Object value) {
		sql="select * from "+table+" where "+column+"="+value+";";
		return runsql.selectSQL(sql);
	}

}
