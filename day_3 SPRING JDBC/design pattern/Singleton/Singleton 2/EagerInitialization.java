package package1;

public class EagerInitialization {
	private static final EagerInitialization eObj = new EagerInitialization();
	
	private EagerInitialization() {}
	
	public static EagerInitialization getInstance() {
		return eObj;
	}
}
