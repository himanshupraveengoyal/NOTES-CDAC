package statePattern2;

public class Index {

	public static void main(String[] args) {
		
		AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new Silent()); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.alert();   

	}

}
