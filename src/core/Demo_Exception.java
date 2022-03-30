package core;

class ExA {

	Number method(String test) throws Error {
		System.out.println("class A method");
	
		return 1;
	}
	
	void method2(String test) throws ArithmeticException {
		System.out.println("class A method2");	
	}
	
	void method3(String test) throws Exception  {
		System.out.println("class A method2");
		if(test == null) {
			throw new Exception("aaaa");
		}
	}
	
}

class ExB extends ExA {

	public Integer method()  {
		System.out.println("class B method");
		return 5;
	}

	

}

public class Demo_Exception {

	public static void main(String[] args) {

		// can call ClassA method only
		ExA a = new ExA();
		a.method("aaaa");
		
		
		ExA aa = new ExA();
		try {
			aa.method2("aaaa");
		
		}catch (Exception e) {			
			e.printStackTrace();
		
		}catch (Throwable e) {			
			e.printStackTrace();
		
		}finally {
			System.out.println("finally block");
		}
		
		//different multiple excepton handliing
		try {
			aa.method2("bbbb");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {			
			e.printStackTrace();
		}
		
		
		try {
			aa.method3(null);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("last line");

	}

}
