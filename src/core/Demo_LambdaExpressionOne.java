package core;

interface LambdaInterfaceOne {
	public void draw();
	//public void draw2();
}

public class Demo_LambdaExpressionOne {
	public static void main(String[] args) {
		int width = 25;
		LambdaInterface lI = () -> {
			System.out.println("CAlling the method Draw --- " + width);
		};
		lI.draw();
//		LambdaInterface lI2 = () -> {
//			System.out.println("CAlling the method Draw2 --- " + width);
//		};
		//lI2.draw2(); // method draw2 is undefined for the type of LambdaInterface
	}

}
