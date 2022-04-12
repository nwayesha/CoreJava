package core;

public class Demo_LambdaThread {
	public static void main(String[] args) throws InterruptedException {
		// without lambda
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
			System.out.println("running thread ...");
							
			}
		};
		Thread thread = new Thread(run1);
		thread.start();

		// with lambda
		Runnable run2 = () -> {
			System.out.println("running thread lambda ...");
		};
		Thread thread2 = new Thread(run2);
		thread2.start();
		
	}
}
