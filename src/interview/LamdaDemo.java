package interview;

import java.util.Arrays;

public class LamdaDemo {

	public static void main(String[] args) {
		int values[] = { 10, 2, 13, 42, 25, 36 };
		
		Arrays.asList(values).parallelStream().forEach((value) -> {			
			System.out.println(value);
		});

	}

}
