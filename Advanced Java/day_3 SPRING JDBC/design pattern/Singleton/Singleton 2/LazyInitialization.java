package package1;

public class LazyInitialization {
	private static LazyInitialization singletonObj = null;
	
	private LazyInitialization() {};
	
	public static LazyInitialization getInstance() {
		if(singletonObj == null) 
			singletonObj = new LazyInitialization();
		return singletonObj;
	}
}
