package core;

import java.nio.BufferOverflowException;

class EncapA {

	private String attribute1;
	private String attribute2;

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

}

class Parent {
	void doSomething() throws Exception {
		System.out.println("doSomething ");
	}

	// unchecked exception
	void doSomething1() throws RuntimeException {
		System.out.println("doSomething RuntimeException");
	}

	// When the parent class method has a throws clause with an unchecked exception,
	// the child class method can throw none or any number of unchecked exceptions,
	// even though they are not related.
	void doSomething2() throws IllegalArgumentException {
		System.out.println("IllegalArgumentException 2");
	}
}

class Child extends Parent {
	void doSomething() throws IllegalArgumentException {
		System.out.println("doSomething IllegalArgumentException");
	}

	void doSomething1() throws RuntimeException {
		System.out.println("doSomething IllegalArgumentException");
	}

	void doSomething2() throws ArithmeticException, BufferOverflowException {
		System.out.println("doSomething2 multiple Exception");
	}
}

public class Demo_encapsulationa {
	
	

	public static void main(String[] args) {

		EncapA a = new EncapA();
		// a.attribute1=10;//can't access private attribute here

		a.setAttribute1("10");
		System.out.println("getAttribute1()" + a.getAttribute1());
		Parent p = new Child();
		try {
			p.doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.doSomething1();
		
	}
	
	
//	public <T extends Throwable> T sneakyThrow(Throwable ex) throws T {
//	    throw (T) ex;
//	}
//
//	public void methodWithoutThrows() {
//		System.out.println("throwing chain exception");
//	    this.<RuntimeException>sneakyThrow(new Exception("Checked Exception"));
//	}

}
