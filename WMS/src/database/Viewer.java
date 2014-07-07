package database;

//to be the entity of select SQL result
public class Viewer {
	String[] column;
	String[] columname;
	//create entity based on data
	public Viewer(int columncounts,String[] columnames){
		column=new String[columncounts];
		this.columname=columnames;
	}
	//count columns
	public int getColumnCounts(){
		return column.length;
	}
	//set value to column[i]
	public void setColumn(int i,String value){
		column[i]=value;
	}
	//get value of column[i]
	public String getColumn(int i){
		return column[i];
	}
	public String getColumnName(int i){
		return columname[i];
	}
	public String[] getColumnName(){
		return columname;
	}

}
