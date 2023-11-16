import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class TestArray {

	public static void main(String[] args) {
		// DECLARATION & INITIALIZATION OF VARIABLES
		Scanner scnr = new Scanner(System.in);
		final int NUM_VALUES = 8; // Array size
		int i ; // Loop index
		int[] numArray = new int[NUM_VALUES]; // User values

//		int[] testNewArray = new int[4];
		
//		walkThroughArray(testNewArray);

		//		System.out.println(testNewArray);

//		popArray(testNewArray);
		
		popArray(numArray);

		// Call method to reverse array values
		reverseVals(numArray);

		// Print updated arrays

		System.out.println();
		
		walkThroughArray(numArray);

		Arrays.sort(numArray);
		
		// print out sorted array
		walkThroughArray(numArray);
		
	}	// end of main

	public static void popArray(int[] populateArray) {
		// INPUT : T[]
		// OUTPUT : N/A 
		// POPULATE ARRAY WITH INTEGERS THAT USER TYPES IN
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter " + populateArray.length + " integers...");
		
		for (int i = 0; i < populateArray.length; ++i) {
			System.out.print("integer:  ");
			populateArray[i] = scnr.nextInt();
		}
	}

	private static void walkThroughArray(int[] walkArray) {
		// INPUT : T[]
		// OUTPUT : PRINT OUT TO SCREEN ONLY, NO RETURN VALUE
		// WALK THROUGH ARRAY, PRINT ELEMENTS OUT TO SCREEN, AND ADD ONE NEW LINE
		for (int i = 0; i < walkArray.length; ++i) {
			System.out.print(walkArray[i] + " ");
		}
		System.out.println();
	}	// end of walkThroughArray

	
	public static void reverseVals(int[] arrVals) {
		// INPUT : T[]
		// OUTPUT : N/A
		// REVERSES ELEMENTS IN ARRAY
		int i, tempValue; // Loop index

		for (i = 0; i < (arrVals.length / 2); ++i) {
			tempValue = arrVals[i]; // Do swap
			arrVals[i] = arrVals[arrVals.length - 1 - i];
			arrVals[arrVals.length - 1 - i] = tempValue;
		}
	}	// end of reverseVals
}
