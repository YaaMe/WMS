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

import database.Cargoin;
import database.CargoinDAO;
import database.Cargorecord;
import database.CargorecordDAO;

import operation.Find;

public class Cargoinservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Cargoinservlet() {
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
			   inerid=request.getParameter("inerid"),
			   area=request.getParameter("area"),
			   row=request.getParameter("row"),
			   shelf=request.getParameter("shelf"),
			   seat=request.getParameter("seat"),
			   state="Èë¿â",
			   remark=request.getParameter("remark");
		
		Find<Cargoin> find=new Find<Cargoin>("cargo_in");
		CargoinDAO cindao=new CargoinDAO();
		Cargoin cargo=find.findById(cargo_id);
		cargo.setCargoInerid(inerid);
		cargo.setCargoIntime(ts);
		cindao.save(cargo);
		
		Find<Cargorecord> find2=new Find<Cargorecord>("cargo_record");
		Cargorecord record=find2.findById(cargo_id);
		CargorecordDAO crdao=new CargorecordDAO();
		record.setCargoArea(area);record.setCargoRow(Integer.parseInt(row));
		record.setCargoShelf(shelf);record.setCargoSeat(Integer.parseInt(seat));
		record.setCargoState(state);record.setCargoRemark(remark);
		record.setCargoBemoved(0);
		crdao.save(record);
		
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
