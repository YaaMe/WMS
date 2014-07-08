package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Cargo;
import database.Cargoin;
import database.Cargomoving;
import database.Cargorecord;
import database.Viewer;

import operation.Find;

public class Searchcargoservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Searchcargoservlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String trackingno=""+request.getParameter("trackingno"),
			   area=""+request.getParameter("area"),
			   row=""+request.getParameter("row"),
			   shelf=""+request.getParameter("shelf"),
			   seat=""+request.getParameter("seat"),
			   state=""+request.getParameter("state");
		//Make sure user want to find by trackingno or location messenage
		if(!trackingno.equals("null")){
			//if user want to follow some of cargo
			//find all of the cargo_trackingno record,maybe still here,maybe back
			Find<Cargoin> findcargos=new Find<Cargoin>("cargo_in");
			List<Cargoin> cargos=findcargos.findBycolumn("cargo_trackingno", trackingno);
			Find<Viewer> findnew=new Find<Viewer>("vw_cargonewstate");
			Find<Viewer> findold=new Find<Viewer>("vw_cargoldstate");
			for(int i=0;i<cargos.size();i++){
				//find every cargo_id of this trackingno(maybe back,or send twice,stc)
				Find <Cargorecord> findrecord=new Find<Cargorecord>("cargo_record");
				Cargorecord record=findrecord.findById(cargos.get(i).getCargoId());
				//if cargo still here,it will exists without cargout table
				if(record.getCargoState().equals("在库")){
					List<Viewer> newdata=findnew.findBycolumn("货物编号", record.getCargoId());
					//////////////////////////////
					//                          //
					//////////////////////////////
				}
				//and else,user maybe want to get the cargout table information
				else{
					List<Viewer> oldata=findold.findBycolumn("货物编号",record.getCargoId());
					//////////////////////////////
					//                          //
					//////////////////////////////
				}
				//if the cargo be moved in this warehouse,maybe user want to get the moving information
				if(record.getCargoBemoved()==1){
					Find<Cargomoving> findmov=new Find<Cargomoving>("cargo_mov");
					List<Cargomoving> movdata=findmov.findBycolumn("cargo_id",record.getCargoId());
					//////////////////////////////
					//                          //
					//////////////////////////////
				}
			}
		}
		//find everything is or was here
		else{
			List<String> columns=new ArrayList<String>();
			List<String> values=new ArrayList<String>();
			//focus the limit
			if(!area.equals("null")){columns.add("区");values.add(area);}
			if(!row.equals("null")){columns.add("排");values.add(row);}
			if(!shelf.equals("null")){columns.add("架");values.add(shelf);}
			if(!seat.equals("null")){columns.add("位");values.add(seat);}
			if(!state.equals("null")){columns.add("状态");values.add(state);}
			
			Find<Cargorecord> find=new Find<Cargorecord>("cargo_record");
			List<Viewer> data=find.findBycolumns(columns,values);
			////////////////////////////
			//                        //
			////////////////////////////
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
