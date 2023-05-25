package _04_jQuery_AJAX;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxEx04")
public class AjaxEx04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("04_jQuery/chapter04_AJAX/ajaxEx04.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String[] userDB = {"user1", "user2", "user3"};
		String id = request.getParameter("id");
		
		String isDuple = "NO";
		
		for (int i = 0; i < userDB.length; i++) {
			if(userDB[i].equals(id)) {
				isDuple = "YES";
			}
		}
		
	   PrintWriter pw = response.getWriter();
	   pw.print(isDuple);
			
	}
	
}
