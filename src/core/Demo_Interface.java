package core;

interface InterfaceA{
	
	//interface attribute implicitly public static final
	int i = 10;
	
	//interface method implicitly abstract and public
	public abstract void method();
	
	public abstract void method2();
	
	public default void method(double d) {
		System.out.println("InterfaceA method double");
	}
}



abstract class TestAbstract implements InterfaceA{
	
	public void method2() {
		System.out.println("TestAbstract method double");		
	}
}


class Cl_A extends TestAbstract{

	@Override
	public void method() {
		System.out.println("Cl_A method");
		
	}	
}


public class Demo_Interface {

	public static void main(String[] args) {
		
		//InterfaceA i =  new InterfaceA(); //can't create a object in interface
		
		
		//InterfaceA i =  new TestAbstract();//can't create a object in abstract class
		
		InterfaceA i =  new Cl_A();
		
		i.method();
		i.method(1.2);
		i.method2();
		
	}

}
