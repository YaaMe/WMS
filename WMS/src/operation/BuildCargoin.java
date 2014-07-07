package operation;

import database.Viewer;

public class BuildCargoin implements I_Build{
	public void buildXLS(String tablename) {
		CreateXLS create=new CreateXLS(tablename);
		Find<Viewer> find=new Find<Viewer>("vw_cargoin");
		create.create(find.findAll());
	}

}
