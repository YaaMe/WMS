package operation;

import java.util.List;

import database.*;

//show warehouse state
public class GetWarehouseState implements I_Get{

	public String[][] getSQLTableToString(String table) {
		String[][] data=null;
		WarehousestateDAO hdao=new WarehousestateDAO();
		Warehousestate hn;
		List house=hdao.findAll();
		data=new String[house.size()][5];
		for(int i=0;i<house.size();i++){
			hn=(Warehousestate) house.get(i);
			data[i][0]=hn.getId().getCargoArea();data[i][1]=hn.getId().getCargoRow().toString();
			data[i][2]=hn.getId().getCargoShelf();data[i][3]=hn.getId().getCargoSeat().toString();
			data[i][5]=hn.getCargoId();
		}
		return data;
	}


}
