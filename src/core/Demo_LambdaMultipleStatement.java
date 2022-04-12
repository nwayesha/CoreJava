package core;

interface Sayable{
	String say(String message);
}

public class Demo_LambdaMultipleStatement {
	public static void main(String[] args) {
		
		Sayable sayable = (sayMessage) -> {
			String message1 = "My message is for : ";
			return message1 + sayMessage;
		};
		System.out.println("calling say method >> "+ sayable.say("Ayesha"));

	}
}
