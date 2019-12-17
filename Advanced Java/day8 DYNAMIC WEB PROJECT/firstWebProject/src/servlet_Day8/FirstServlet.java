package servlet_Day8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("1");
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("2");
		String pagename="/WEB-INF/bk.html";
		String value=request.getParameter("purpose");
		if(value.equals("A"))
		{
			AController aController= new AController();
			pagename=aController.controllerFunction();
		}
		else if(value.equals("B"))
		{
			BController bController= new BController();
			pagename=bController.controllerFunction();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(pagename);
		rd.forward(request,response);
	}

}
