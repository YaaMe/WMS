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

import database.CargoDAO;
import database.Cargoin;
import database.CargoinDAO;
import database.Cargorecord;
import database.CargorecordDAO;

public class Cargoreadyservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Cargoreadyservlet() {
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
		SimpleDateFormat df = new SimpleDateFormat("yyyymmddhhmmss"),
						 df2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now=new Date();
		Timestamp ts=Timestamp.valueOf(df2.format(now));
		String time=df.format(now);
		String trackingno=request.getParameter("trackingno"),
			   checkerid=request.getParameter("checkerid"),
			   kg=request.getParameter("kg"),
			   isintact=request.getParameter("isintact"),
			   state="´ýÈë",
			   remark=request.getParameter("remark"),
			   cargoId=trackingno.substring(0,2)+time+"00";
		response.setContentType("text/html");
		
		Cargorecord record=new Cargorecord();
		CargorecordDAO crdao=new CargorecordDAO();
		
		record.setCargoId(cargoId);
		record.setCargoIsintact(Integer.parseInt(isintact));
		record.setCargoKg(Double.parseDouble(kg));
		record.setCargoRemark(remark);
		record.setCargoState(state);
		crdao.save(record);
		
		Cargoin cargo=new Cargoin();
		CargoinDAO cdao=new CargoinDAO();
		
		cargo.setCargoId(cargoId);
		cargo.setCargoCheckerid(checkerid);
		cargo.setCargoGetime(ts);
		cargo.setCargoTrackingno(trackingno);
		cdao.save(cargo);
		
		
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
