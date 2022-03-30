package core;

class TestAA{
	public void method() {
		System.out.println("TestAA method");
	}
	
	public void method(double d) {
		System.out.println("TestAA method double");
	}
}



class TestA extends TestAA{
//	
//	public void method() {
//		System.out.println("class A method");
//	}
//	
	public Number method(String test) {
		System.out.println("class A method String"+test);
		return 1;
	}

	
	public Number method(Integer i) {
		System.out.println("class A method Integer"+i);
		return 1;
	}

	public Number method(int i) {
		System.out.println("class A method int"+i);
		return 1;
	}

}


public class Demo_Overrloading {

	public static void main(String[] args) {
		
		TestA a = new TestA();		
		a.method();	
		a.method(2.0);	
		a.method(10);
		a.method(new Integer(10));
		a.method("aaaaa");

		TestAA ba = new TestA();		
		a.method();	
	}

}
