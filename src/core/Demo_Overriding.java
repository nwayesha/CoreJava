package core;

class ClassA {

	Number method() {
		System.out.println("class A method");
		return 1;
	}

	public static void staticmethod() {
		System.out.println("class A staticmethod");
	}

	private void privatemethod() {
		System.out.println("class A privatemethod()");
	}

}

class ClassB extends ClassA {

	public Integer method() {
		System.out.println("class B method");
		return 5;
	}

	public void methodB() {
		this.privatemethod();
		System.out.println("class B methodB");
	}

	public static void staticmethod() {
		System.out.println("class B staticmethod");
	}

	private void privatemethod() {
		System.out.println("class B privatemethod()");
	}

}

public class Demo_Overriding {

	public static void main(String[] args) {

		// can call ClassA method only
		ClassA a = new ClassA();
		a.method();

		// Can call ClassA method but Overriding will happen
		ClassA b = new ClassB();
		b.method();

		// Can call ClassA method but run time pholoimophisome is not applied
		ClassA bb = new ClassB();
		bb.staticmethod();

		// call same class method
		ClassB c = new ClassB();
		c.method();
		c.methodB();

		// private method not override in subclass
		//ClassA dd = new ClassB();
		//dd.privatemethod();

	}

}
