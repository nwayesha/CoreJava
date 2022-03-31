package designpattern.creational.singleton;

public class CommonUtils {
	
	private CommonUtils() {
		
	}
	
	public static volatile CommonUtils instance = null;
	
	
	public static CommonUtils getInstance() {
		if(instance == null) {
			if(instance == null) {				
				instance = new CommonUtils();
			}
		}
		return instance;
	}
	
	
	public String getMessage() {
		return "Hello world";
	}
}
