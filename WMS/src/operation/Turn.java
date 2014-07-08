package operation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import database.*;

public class Turn {
	public User turnToUser(Viewer view){
		User user=new User(view.getColumn(0),view.getColumn(1),view.getColumn(2),view.getColumn(3),view.getColumn(4));
		return user;
	}
	public List<User> turnToUser(List<Viewer> views){
		List<User> users=new ArrayList<User>();
		for(int i=0;i<views.size();i++)
			users.add(turnToUser(views.get(i)));
		return views.size()==0?null:users;
	}
	public Cargo turnToCargo(Viewer view){
		Cargo cargo=new Cargo(view.getColumn(0),view.getColumn(1),view.getColumn(2));
		return cargo;
	}
	public List<Cargo> turnToCargo(List<Viewer> views){
		List<Cargo> cargos=new ArrayList<Cargo>();
		for(int i=0;i<views.size();i++)
			cargos.add(turnToCargo(views.get(i)));
		return views.size()==0?null:cargos;
	}
	public Cargoin turnToCargoin(Viewer view){
		Cargoin cargoin=new Cargoin(view.getColumn(0),view.getColumn(1),
									Timestamp.valueOf(view.getColumn(2)),
									Timestamp.valueOf(view.getColumn(3)),
									view.getColumn(4),view.getColumn(5));
		return cargoin;
		
	}
	public List<Cargoin> turnToCargoin(List<Viewer> views){
		List<Cargoin> cargos=new ArrayList<Cargoin>();
		for(int i=0;i<views.size();i++)
			cargos.add(turnToCargoin(views.get(i)));
		return views.size()==0?null:cargos;
	}
	public Cargomoving turnToCargomoving(Viewer view){
		Cargomoving cargomov=new Cargomoving(view.getColumn(1),Timestamp.valueOf(view.getColumn(2)),
											 view.getColumn(3),view.getColumn(4),
											 Integer.parseInt(view.getColumn(5)),
											 view.getColumn(6),
											 Integer.parseInt(view.getColumn(7)),
											 view.getColumn(8),
											 Integer.parseInt(view.getColumn(9)),
											 view.getColumn(10),
											 Integer.parseInt(view.getColumn(11)));
		return cargomov;
	}
	public List<Cargomoving> turnToCargomoving(List<Viewer> views){
		List<Cargomoving> cargos=new ArrayList<Cargomoving>();
		for(int i=0;i<views.size();i++)
			cargos.add(turnToCargomoving(views.get(i)));
		return views.size()==0?null:cargos;
	}
	public Cargorecord turnToCargorecord(Viewer view){
		Cargorecord record=new Cargorecord(view.getColumn(0),Double.parseDouble(view.getColumn(1)),
										   Integer.parseInt(view.getColumn(2)),view.getColumn(3),
										   view.getColumn(4),Integer.parseInt(view.getColumn(5)),
										   view.getColumn(6),Integer.parseInt(view.getColumn(7)),
										   view.getColumn(8),Integer.parseInt(view.getColumn(9)));
		return record;
	}
	public List<Cargorecord> turnToCargorecord(List<Viewer> views){
		List<Cargorecord> cargos=new ArrayList<Cargorecord>();
		for(int i=0;i<views.size();i++)
			cargos.add(turnToCargorecord(views.get(i)));
		return views.size()==0?null:cargos;
	}
	public Cargout turnToCargout(Viewer view){
		Cargout cargo=new Cargout(view.getColumn(0),Timestamp.valueOf(view.getColumn(1)),
								  view.getColumn(2),view.getColumn(3));
		return cargo;
	}
	public List<Cargout> turnToCargout(List<Viewer> views){
		List<Cargout> cargos=new ArrayList<Cargout>();
		for(int i=0;i<views.size();i++)
			cargos.add(turnToCargout(views.get(i)));
		return views.size()==0?null:cargos;
	}
	public Warehousestate turnToWarehousestate(Viewer view){
		WarehousestateId houseid=new WarehousestateId(view.getColumn(0),Integer.parseInt(view.getColumn(1)),
													  view.getColumn(2),Integer.parseInt(view.getColumn(3)));
		Warehousestate house=new Warehousestate(houseid,view.getColumn(4));
		return house;
	}
	public List<Warehousestate> turnToWarehousestate(List<Viewer> views){
		List<Warehousestate> house=new ArrayList<Warehousestate>();
		for(int i=0;i<views.size();i++)
			house.add(turnToWarehousestate(views.get(i)));
		return views.size()==0?null:house;
	}
	
}
