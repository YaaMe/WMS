package database;

public class Viewer {
	String[] column;
	public Viewer(int columncounts){
		column=new String[columncounts];
	}
	public int getColumnCounts(){
		return column.length;
	}
	public void setColumn(int i,String value){
		column[i]=value;
	}
	public String getColumn(int i){
		return column[i];
	}

}
