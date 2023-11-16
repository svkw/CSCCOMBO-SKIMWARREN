import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		//***** integer & String declaration and initialization

		int numOne = 0, numTwo = 0, numThree = 0, ranNum = 0;
		String inputChar;						// holds input String from user
		String word1 = "Input integer >> ";		// prompt to get integer
		// input (Scanner) declaration and initialization
		Scanner scnrStr = new Scanner(System.in);
		Random ranInt = new Random();
		int [] ranArray = new int [10];			// random number array

		//*****
		
		System.out.println("Would you like to add integers (y|n)");
		inputChar = scnrStr.next();
				
		while (inputChar.equalsIgnoreCase("y")) {	// if inputChar = y
//			for (int i = 0; inputChar.equalsIgnoreCase("y"); i++) {
			// setting three integers
				out2Screen(word1);
				numOne = getNumber();
				out2Screen(word1);
				numTwo = getNumber();
				out2Screen(word1);
				numThree = getNumber();

				// setting while loop condition to end
				inputChar = "n";

//		      System.out.println(numOne + " : " + numTwo + " : " + numThree);
//	    	  words = scnr.next();
//	    	  userChar = scnr.next().charAt(0);
//	    	  System.out.println();
//	    	  userChar = scnrStr.next();
		}						// end of while loop
		
		//System.out.println();
		
		// print out sum of three integers
			System.out.println("sum is : " + (numOne + numTwo + numThree));
			
			System.out.println("smallest number : " + smallNum(numOne, numTwo, numThree));
			System.out.println("average number : " + avgNum(numOne, numTwo, numThree));
			
			// generate random numbers and stores in array
			System.out.println("Type in one integer between 1 and 100");
			ranNum = scnrStr.nextInt();
			
			System.out.println("10 random numbers between 1 and " + ranNum +  " are ... ");
			
			for (int k = 0; k < ranArray.length; k++) {
				ranArray[k] = genRandom(ranNum);
				System.out.println("random number is " + ranArray[k]);
			}
			
			out2Screen("Input a string");
			inputChar = getInputString();
			out2Screen(inputChar);
			System.out.println(inputChar.length());
			
			
			out2Screen("Good Bye!");
//		}
	}

	private static int genRandom(int inputInt) {
		// return randomly generated integer between 0 and range (inputInt)
		Random rInt = new Random();	
		return rInt.nextInt(inputInt);	
	}

	public static String getInputString() {
		// read in input String until the end of line
		String inputStr = "";
		Scanner scnrStr = new Scanner(System.in);
		inputStr = scnrStr.nextLine();
		return inputStr;
	}

	public static double avgNum(int num1, int num2, int num3) {
		// expects 3 integer input
		return ((double) (num1 + num2 + num3))/3;
	}

	public static int smallNum(int num1, int num2, int num3) {
		// returns smallest number from 3 numbers
		return isSmall(isSmall(num1, num2), num3);
	}
	
	public static int isSmall(int num1, int num2) {
		if (num1 <= num2) {	// first number is smaller than 2nd number to return
			return num1;
		}
		else {				// second number is smaller than 1st number to return
			return num2;
		}
	}

	public static boolean setScnrStr(String setWord) {
		// set scnrStr to y or n
		Scanner scnrStr = new Scanner(System.in);
		String boolChar;
		System.out.println(setWord);
		
		boolChar = scnrStr.next();
		if (boolChar.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

	public static int getNumber() {
		// return user input integer
		Scanner scnrNum = new Scanner(System.in);
		int inNum;

		inNum = scnrNum.nextInt();
		return inNum;
	}
	
	public static void out2Screen(String coutWords) {
		// output words to screen
		System.out.println(coutWords);
	}
}

//currPower = 2;
//userChar = "y";
//userChar = scnr.next().charAt(0);

