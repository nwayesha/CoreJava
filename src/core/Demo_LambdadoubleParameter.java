package core;
interface LambdaInterfaceDoubleParameter {
	public void say(String name, int age);
}

public class Demo_LambdadoubleParameter {
	public static void main(String[] args) {
		LambdaInterfaceDoubleParameter lI = (String givenName, int givenAge) -> {
			System.out.println("CAlling the method Draw name--- " + givenName + "  age --"+ givenAge);
		};
		lI.say("Ayesha", 35);

	}
}
