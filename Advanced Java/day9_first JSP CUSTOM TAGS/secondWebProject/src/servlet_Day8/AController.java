package servlet_Day8;

public class AController {

	public String controllerFunction() 
	{
		String filename="/WEB-INF/c1.html";
		System.out.println("A Controller Called");
		return filename;
	}

}
