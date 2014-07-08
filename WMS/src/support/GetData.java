package support;

import java.util.List;

import operation.Find;

import database.Viewer;

public class GetData {
	List<Viewer> data;
	public GetData(String view){
		Find<Viewer> findready=new Find<Viewer>(view);
		data=findready.findAll();
	}
	public List<Viewer> getData(){
		return data;
	}
	public Viewer get(int i){
		return data.get(i);
	}
	public int getSize(){
		return data.size();
	}
	public int getColumnCounts(){
		return data.get(0).getColumnCounts();
	}
	public String getColumnName(int i){
		return data.get(0).getColumnName(i);
	}
	public String get(int i,int j){
		return data.get(i).getColumn(j);
	}
}
