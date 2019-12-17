package servlet_Day8;

public class BController {

	public String controllerFunction() 
	{
		String filename="/WEB-INF/c2.html";
		System.out.println("B Controller Called");
		return filename;
	}

}
