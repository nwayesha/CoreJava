package interview;

import java.util.Iterator;

public class CalculateTotalArrayDemo {

	public static void main(String[] args) {
		int values[] = { 10, 2, 13, 42, 25, 36 };

		int total = 0;
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
		System.out.println("total value :: " + total);
	}
}
