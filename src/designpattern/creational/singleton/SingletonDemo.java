package designpattern.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
	
		
		String message = CommonUtils.getInstance().getMessage();
		System.out.println(message);

	}

}
