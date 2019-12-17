package servlet_Day8;

import javax.servlet.http.HttpServletRequest;

public class MultipleController {

	public String getMultiple(HttpServletRequest request) 
	{
		String pagename ="/WEB-INF/R3.jsp";
		String enumber = request.getParameter("numb");
		int numb=Integer.parseInt(enumber.trim());
		request.setAttribute("MT", numb);
		return pagename;
	}

}
