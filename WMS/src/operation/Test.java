package operation;

import java.util.List;


import database.*;

public class Test {
	public static void main(String[] args) {
		Find find=new Find("user");
		User user=(User) find.findById("00120110327");
		System.out.println(user.getUName());
		//System.out.println("name".hashCode());
		//System.out.println("type".hashCode());
	}
}
