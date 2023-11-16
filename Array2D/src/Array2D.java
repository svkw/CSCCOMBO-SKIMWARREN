
public class Array2D {

	public static void main(String[] args) {
		int[] array1D = {0, 1, 2, 3, 4};
		for ( int i = 0; i < array1D.length; i++) {
			System.out.print(array1D[i] + " ");
		}
		printLn();
		int [][] array2D = {
				{0, 2, 4, 6},
				{1, 3, 5, 7},
				{1, 1, 2, 3, 5},
				{1, 2, 3, 5, 8, 13}
		};

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			printLn();
		}
		printLn();
		
		int [] myArray1D = new int [5];
		for (int i = 0; i < myArray1D.length; i++) {
			myArray1D[i] = i;
		}
		
		int [][] myArray2D = new int [4][5];
		int [] histogram = new int [26];
		
		String input = "hello";
		for (int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			histogram[letter - 'a']++;
		}
		
		for (int i = 0; i < histogram.length; i++) {
			System.out.print(histogram[i] + " ");
		}
		
		// 2D array
		for (int i = 0; i < myArray2D.length; i++) {
			for (int j = 0; j < myArray2D[i].length; j++) {
				myArray2D[i][j] = i+j;
			}
		}
				
		
	}
	
	private static void printLn() {
		System.out.println();
	}

}
