package operation;

public class Build implements I_Build{
	I_Build build=null;
	public Build(String type){
		switch(type.toLowerCase().hashCode()){//������ת����Сд����ת���ɹ�ϣ�롣ÿһ���ַ���ֻ�ܶ�Ӧһ����ϣ�룬��һ����ϣ������ܶ�Ӧ����ַ�����
		case 554038753:build=new BuildCargoin();break;//cargoin
		case 554039131:build=new BuildCargout();break;//cargout
		}
	}
	public void buildXLS(String tablename) {
		build.buildXLS(tablename);
	}

}
