package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import operation.Find;

import database.Cargomoving;
import database.Cargorecord;

public class Cargomovservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Cargomovservlet() {
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
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now=new Date();
		Timestamp ts=Timestamp.valueOf(df.format(now));
		
		String cargo_id=request.getParameter("cargo_id"),
			   movtime,
			   moverid=request.getParameter("moverid"),
			   newarea=request.getParameter("newarea"),
			   newrow=request.getParameter("newrow"),
			   newshelf=request.getParameter("newshelf"),
			   newseat=request.getParameter("newseat");
		
		Find<Cargorecord> find=new Find<Cargorecord>("cargo_record");
		Cargorecord oldcargo=find.findById(cargo_id);
		String oldarea=oldcargo.getCargoArea();
		int oldrow=oldcargo.getCargoRow();
		String oldshelf=oldcargo.getCargoShelf();
		int oldseat=oldcargo.getCargoSeat();
		
		Cargomoving newcargo=new Cargomoving();
		newcargo.setCargoId(cargo_id);
		newcargo.setCargoMoverid(moverid);
		newcargo.setCargoMovtime(ts);
		
		newcargo.setCargoOldarea(oldarea);
		newcargo.setCargoOldrow(oldrow);
		newcargo.setCargoOldshelf(oldshelf);
		newcargo.setCargoOldseat(oldseat);
		
		newcargo.setCargoNewarea(newarea);
		newcargo.setCargoNewrow(Integer.parseInt(newrow));
		newcargo.setCargoNewshelf(newshelf);
		newcargo.setCargoNewseat(Integer.parseInt(newseat));
		
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
