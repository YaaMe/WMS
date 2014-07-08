package operation;
//maintenance of creating XLS
public class Build implements I_Build{
	I_Build build=null;
	public Build(String type){
		switch(type.toLowerCase().hashCode()){//将类型转换成小写，并转换成哈希码。每一个字符串只能对应一个哈希码，而一个哈希码则可能对应多个字符串。
		case 554038753:build=new BuildCargoin();break;//cargoin
		case 554039131:build=new BuildCargout();break;//cargout
		}
	}
	public void buildXLS(String tablename) {
		build.buildXLS(tablename);
	}

}
