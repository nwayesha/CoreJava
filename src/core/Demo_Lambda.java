package core;

interface LambdaInterface {
	public void draw();
}

public class Demo_Lambda {

	public static void main(String[] args) {
		int width = 25;

		LambdaInterface lI = new LambdaInterface() {

			@Override
			public void draw() {
				System.out.println("CAlling the method Draw // " + width);

			}
		};
		lI.draw();
	}

}


