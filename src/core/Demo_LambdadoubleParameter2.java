package core;
interface LambdaInterfaceDoubleParameter2 {
	public int say(int firstNum, int secondNum);
}

public class Demo_LambdadoubleParameter2 {
	public static void main(String[] args) {
		LambdaInterfaceDoubleParameter2 lI = (int firstNum, int secondNum) -> {
			return firstNum +  secondNum;
			
		};
		System.out.println("CAlling the method Draw name--- " + lI.say(50, 35));
	}
}
