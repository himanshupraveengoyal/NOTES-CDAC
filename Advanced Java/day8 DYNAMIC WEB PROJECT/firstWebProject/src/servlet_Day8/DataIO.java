package servlet_Day8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataIO
 */
@WebServlet("/DataIO")
public class DataIO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataIO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NumberCalculationController numbercalculate=new NumberCalculationController();
		String pagename=numbercalculate.numberDivisibility(request);
		RequestDispatcher rd=request.getRequestDispatcher(pagename);
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		NumberCalculationController numbercalculate=new NumberCalculationController();
		String pagename=numbercalculate.oddOrEven(request);
		RequestDispatcher rd=request.getRequestDispatcher(pagename);
		rd.forward(request,response);
	}
	

}
