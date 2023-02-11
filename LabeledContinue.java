//You can use labels with break and continue.
//Labels are where you can shift control from break and continue.
//By default continue ignores rest statements and goes to the start of loop
//but if you more than one loop
//You can use the continue statement to ignore a specific loop by providing labels.

public class LabeledContinue {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 9, 10, 11, 12 }, {13, 14, 15, 16} };
		// find index of first even int of every inner array
		searchint:
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col]%2==0) {
					System.out.println("First even int in cuurent array is: " + arr[row][col]);
					// using continue label
					continue searchint; //if i use simple continue here, it will also display the second even in the arrays
				}
			}
		}
	}
}
