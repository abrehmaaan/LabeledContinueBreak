//You can use labels with break and continue.
//Labels are where you can shift control from break and continue.
//By default break goes outside of loop but if you more than one loop
//You can use the break statement to break a specific loop by providing labels.

public class LabeledBreak {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 }, {13, 14} };
		boolean found = false;
		int row = 0;
		int col = 0;
		// find index of first int greater than 10
		searchint:
		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > 10) {
					found = true;
					// using break label to terminate outer statements
					break searchint; //if i use simple break here, it will just break the inner loop
				}
			}
		}
		if (found)
			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
	}
}
