package core;
interface LambdaInterfaceSingleParameter {
	public void say(String name);
}

public class Demo_LambdaSingleParameter {
	public static void main(String[] args) {
		LambdaInterfaceSingleParameter lI = (sss) -> {
			System.out.println("CAlling the method Draw --- " + sss);
		};
		lI.say("Ayesha");

	}
}
