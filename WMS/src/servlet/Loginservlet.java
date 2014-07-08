package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import support.LoginIllgal;
import support.Loginselect;


public class Loginservlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Loginservlet() {
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
		PrintWriter out=response.getWriter();

		String id=request.getParameter("username"),
		password=request.getParameter("password");
		
		LoginIllgal illgal=new LoginIllgal();
		boolean isright=illgal.isIllgal(id, password);
		System.out.println(isright);
		if(isright){
			request.getSession().setAttribute("status",1);
	//		System.out.println(request.getSession().getAttribute("status"));
	//		Loginselect select=new Loginselect(id);
	//		String nextjsp=select.getNext();
			request.getSession().setAttribute("username",id);
			request.getSession().setAttribute("password",password);
	//		if(nextjsp.contains("checker.jsp")){
				
		//	}
	//		else if(nextjsp.contains("admin.jsp")){
				
	//		}
			
		}
		else{
			String stauts="error";
			request.getSession().setAttribute("status",stauts);
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
