package operation;

import database.Viewer;
//create cargout xls
public class BuildCargout implements I_Build{
	public void buildXLS(String tablename) {
		CreateXLS create=new CreateXLS(tablename);
		Find<Viewer> find=new Find<Viewer>("cargout");
		create.create(find.findAll());
	}

}
