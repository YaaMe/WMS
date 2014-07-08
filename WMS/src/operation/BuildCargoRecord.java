package operation;

import java.util.List;

import database.Viewer;
//create cargorecord xls
public class BuildCargoRecord implements I_Build{
	public void buildXLS(String tablename) {
		CreateXLS create=new CreateXLS(tablename);
		Find<Viewer> find=new Find<Viewer>("cargorecord");
		List<Viewer> data=find.findAll();
		create.create(data);
		for(int i=0;i<data.size();i++){
			if(data.get(i).getColumn(9).equals("1")){
				find=new Find<Viewer>("cargomoving");
				List<Viewer> movrecord=find.findBycolumn("cargo_id",data.get(i).getColumn(0));
				create=new CreateXLS(data.get(i).getColumn(0)+"movrecord");
				create.create(movrecord);
			}
		}
	}
	
}
