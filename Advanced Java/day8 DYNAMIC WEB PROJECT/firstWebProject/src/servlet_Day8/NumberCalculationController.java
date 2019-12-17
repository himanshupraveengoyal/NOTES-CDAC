package servlet_Day8;

import javax.servlet.http.HttpServletRequest;

public class NumberCalculationController {

	public String oddOrEven(HttpServletRequest request) 
	{
		String pagename ="/WEB-INF/R1.jsp";
		String enumber = request.getParameter("numb");
		int enumb=Integer.parseInt(enumber.trim());
		if(enumb%2==0)
			request.setAttribute("EO", "Number is Even");
		else
			request.setAttribute("EO", "Number is Odd");
		return pagename;
	}

	public String numberDivisibility(HttpServletRequest request) 
	{
		String pagename ="/WEB-INF/R2.jsp";
		String enumber = request.getParameter("numb");
		int enumb=Integer.parseInt(enumber.trim());
		if(enumb%7==0)
			request.setAttribute("DB7", "Number is Divisible by 7");
		else
			request.setAttribute("DB7", "Number is Not Divisible by 7");
		return pagename;
	}

}
