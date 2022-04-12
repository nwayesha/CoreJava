package core;

import java.util.ArrayList;

public class Demo_LambdaForEach {
	public static void main(String[] args) {
		ArrayList<String> nameArray = new ArrayList<>();
		nameArray.add("Ayesha");
		nameArray.add("Thusitha");
		nameArray.add("Sandeli");
		nameArray.add("Shaneli");
		nameArray.add("Amindu");

		nameArray.forEach((size) -> System.out.println("for each--- " + size));

	}
}
