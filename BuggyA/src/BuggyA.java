import java.util.Scanner;

public class BuggyA {

	public static void main(String[] args) {
		//int[] single = {1, 2, 3, 4, 5};
		
		//int[] in1 = new int[5];
		//in1[0] = 1;
		//in1[1] = 10;
		int theNumChange = 0;
		int[][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				//if (i == 3 && j == 1) {
					theNumChange = arr[i][j];
				//}
				System.out.println("value is " + arr[i][j]);
			}
		}
		
		Scanner scnr = new Scanner(System.in);
		double celsiusValue;
		double fahrenheitValue;
		char userChar;

		celsiusValue = 0.0;
		userChar = 'y';

		while (userChar == 'y') {
			fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32.0;
			
			System.out.print(celsiusValue + " C is ");
			System.out.println(fahrenheitValue + " F"); 

			System.out.print("Type y to continue, any other to quit: ");
			userChar = scnr.next().charAt(0);

			celsiusValue = celsiusValue + 5;
			System.out.println("");
		}
	   
		System.out.println("Goodbye.");


	}

}
