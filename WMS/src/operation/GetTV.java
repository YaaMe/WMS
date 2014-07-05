package operation;

import java.util.List;

//maintenance of Get table or view in SQLServer
public class GetTV implements I_Get{
	I_Get get=null;
	GetTV(String table){
		switch(table.toLowerCase().hashCode()){
		case 13683630:get=new GetWarehouseState();break;//warehousestate
		}
	}

	public String[][] getSQLTableToString(String table) {
		return get.getSQLTableToString(table);
	}
	
}
