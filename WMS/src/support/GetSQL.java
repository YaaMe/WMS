package support;

public class GetSQL {
	String table="";
	public GetSQL(String table){
		this.table=table;
	}
	public String columnsLimit(String[] columns,String[] values){
		String sql="select * from "+table+" where "+columns[0]+"='"+values[0]+"'";
		for(int i=1;i<columns.length;i++)//���ж�������������forѭ��
			sql+=" and "+columns[i]+"='"+values[i]+"'";
		sql+=";";
		return sql;
	}
}
