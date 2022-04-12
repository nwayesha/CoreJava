package interview;

import java.util.Arrays;
import java.util.Iterator;

public class CalculateMaxValueDemo {

	public static void main(String[] args) {
		int values[] = { 10, 2, 13, 42, 25, 36 };

		int maxValue = 0;
		for (int count = 0; count < values.length; count++) {
			maxValue = (values[count] > maxValue) ? values[count] : maxValue;
		}
		System.out.println("maximum value :: " + maxValue);

		int nextMaxValue = 0;
		for (int value : values) {
			nextMaxValue = (value > nextMaxValue) ? value : nextMaxValue;
		}
		System.out.println("nextMaxValue value :: " + nextMaxValue);

		
		
	

	}
}
