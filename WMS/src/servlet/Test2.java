package servlet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test2 {
	public static void main(String[] args){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		//String time=df.format(date);
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
	}
}
