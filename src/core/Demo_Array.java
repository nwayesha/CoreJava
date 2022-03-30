package core;

public class Demo_Array {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 63;
		marks[1] = 85;
		marks[2] = 97;
		marks[3] = 66;
		marks[4] = 70;
		for (int iterator = 0; iterator < marks.length; iterator++)
			System.out.println("Marks of Student " + (iterator + 1) + ": " + marks[iterator]);

		for (int iterator : marks)
			System.out.println(iterator);

		int myArray[] = { 1, 2, 3, 4, 5, 6 }; // creating array
		System.out.println("Array before passing to a method:");
		{
			for (int i = 0; i < myArray.length; i++) {
				System.out.println(myArray[i]);
			}
		}
		System.out.println("Array after passing to a method:");
		// calling method by passing myArray to them.
		manipulateArray(myArray);
		display(myArray);
	} // main method ends here

	static void manipulateArray(int a[]) // declaring method
	{
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * 10;
		}
	}

	static void display(int a[]) // declaring method
	{
		System.out.println("Displaying array elements after multiplying each element by 10:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// declaring and initializing a two-dimensional array
		int[][] myArray = new int[3][3];
		myArray[0][0] = 1;
		myArray[0][1] = 2;
		myArray[0][2] = 3;
		myArray[1][0] = 4;
		myArray[1][1] = 5;
		myArray[1][2] = 6;
		myArray[2][0] = 7;
		myArray[2][1] = 8;
		myArray[2][2] = 9;
		// printing a two-dimensional array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
