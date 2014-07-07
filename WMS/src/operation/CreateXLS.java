package operation;

//To create Excel
import  java.io.File;
import java.util.List;

import database.Viewer;

import  jxl.Workbook;
import  jxl.write.Label;
import  jxl.write.WritableSheet;
import  jxl.write.WritableWorkbook;

public class CreateXLS{
	String name;
	CreateXLS(String name){
		this.name=name;
	}
  	public void create(String[][] data){
  		try{
  			//open file
  			WritableWorkbook book=Workbook.createWorkbook(new File(name+".xls"));
  			//create sheet named "first",0 means it's the First page
  			WritableSheet sheet=book.createSheet("first",0);
  			Label label=null;
  			for(int i=0;i<data.length;i++)
  				for(int j=0;j<data[i].length;j++){
  					label=new Label(j,i,data[i][j]);
  					sheet.addCell(label);
  				}
  			//write data
  			book.write();
  			book.close();

  		}catch(Exception e){
  			System.out.println(e);
  		}
	}
  	public void create(List<Viewer> data){
  		try{
  			//open file
  			WritableWorkbook book=Workbook.createWorkbook(new File(name+".xls"));
  			//create sheet named "first",0 means it's the First page
  			WritableSheet sheet=book.createSheet("first",0);
  			Label label=null;
  			//set title
  			for(int i=0;i<data.get(0).getColumnCounts();i++){
  				label=new Label(i,0,data.get(0).getColumnName(i));
  				sheet.addCell(label);
  			}
  			//set data
  			for(int i=0;i<data.size();i++)
  				for(int j=0;j<data.get(i).getColumnCounts();j++){
  					label=new Label(j,i+1,data.get(i).getColumn(j));
  					sheet.addCell(label);
  				}
  			//write data
  			book.write();
  			book.close();

  		}catch(Exception e){
  			System.out.println(e);
  		}
  	}
} 