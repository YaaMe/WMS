package support;

import java.util.List;

public class GetSQL {
	String table="";
	public GetSQL(String table){
		this.table=table;
	}
	public String columnsLimit(List<String> columns,List<String> values){
		String sql="select * from "+table+" where "+columns.get(0)+"='"+values.get(0)+"'";
		for(int i=1;i<columns.size();i++)//���ж�������������forѭ��
			sql+=" and "+columns.get(i)+"='"+values.get(i)+"'";
		sql+=";";
		return sql;
	}
}
