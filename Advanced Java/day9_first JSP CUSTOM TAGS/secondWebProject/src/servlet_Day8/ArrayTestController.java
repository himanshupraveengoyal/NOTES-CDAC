package servlet_Day8;

import javax.servlet.http.HttpServletRequest;

public class ArrayTestController {

	public String getArrayTry(HttpServletRequest request) 
	{
		String pn ="/WEB-INF/res.jsp";
		int enumb=Integer.parseInt(request.getParameter("numb"));
		int multiple=Integer.parseInt(request.getParameter("multi"));
		int a[]=new int[multiple];
		for(int k=0;k<a.length;k++)
		{
			a[k]=(k+1)*enumb;
		}
		
		request.setAttribute("k1",a);
		return pn;
	}

}
