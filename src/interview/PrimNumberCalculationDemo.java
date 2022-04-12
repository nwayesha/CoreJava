package interview;

public class PrimNumberCalculationDemo {
	public static void main(String args[]) {

		int givenNumberSize = 200;
		int count, sum = 0;

		// for loop
		for (int index = 0; index < givenNumberSize; index++) {
			count = 0;
			for (int x = 2; x < index / 2; x++) {
				if (index % x == 0) {
					count++;
					System.out.println("not prime number  " + index);
					break;
				}
			}
			if (count == 0 && index != 1) {
				sum = sum + index;
			}

		}
		System.out.println("some of prime number  " + sum);

	}
}
