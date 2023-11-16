import java.util.Scanner;

public class PlayJava {

	public static void main(String[] args) {

//		Scanner scnr = new Scanner(System.in);
//		int currPower;
//		char userChar;
//		
//		currPower = 2;
//		userChar = 'y';
//		 
//		while (userChar == 'y') {
//			System.out.println(currPower);
//			currPower = currPower * 2;
//			userChar = scnr.next().charAt(0);
//		}
//		 
//		System.out.println("Good Bye!");
		

	      Scanner scnr = new Scanner(System.in);
	      String inputWord;
	      int numLetters;
	      int i;

//	      System.out.print("Enter a word: ");
//	      inputWord = scnr.next();
//
//	      numLetters = 0;
//	      for (i = 0; i < inputWord.length(); ++i) {
//	         if (Character.isLetter(inputWord.charAt(i))) {
//	            numLetters ++;
//	         }
//	      }
//
//	      System.out.println("Number of letters: " + numLetters);
//	      System.out.println("i values is : " + i);
	      
	      // printf practice
	      double numFormat;
	      numFormat = 45678.56798;
	      
	      System.out.printf("playing value is %10.2f %n", numFormat);
	      System.out.println(numFormat);

//		prints out table 	      
//	      1     2     3     4     5     6     7     8     9    10
//	      11    12    13    14    15    16    17    18    19    20
//	      21    22    23    24    25    26    27    28    29    30
//	      31    32    33    34    35    36    37    38    39    40
//	      41    42    43    44    45    46    47    48    49    50
//	      51    52    53    54    55    56    57    58    59    60
//	      61    62    63    64    65    66    67    68    69    70
//	      71    72    73    74    75    76    77    78    79    80
//	      81    82    83    84    85    86    87    88    89    90
//	      91    92    93    94    95    96    97    98    99   100

//	      for (int count = 0 ; count < 100; count+= 10) {
//
//	    	  for (int k = 1; k <= 10; k++) {
//	    		  System.out.printf("%6d", count + k);
//	    	  }
////	    	  System.out.println();
//	    	  System.out.printf("%n");	// same as above
//	      }
	      
//	      for (int j = 1; j <=100; j++) {
//	    	  System.out.printf("%6d", j);
//	    	  if ( j%10 == 0) {
//	    		  System.out.println();
//	    	  }
//	      }
	      
	      System.out.println();

// prints out multiplication table
//	      1     2     3     4     5     6     7     8     9
//	      2     4     6     8    10    12    14    16    18
//	      3     6     9    12    15    18    21    24    27
//	      4     8    12    16    20    24    28    32    36
//	      5    10    15    20    25    30    35    40    45
//	      6    12    18    24    30    36    42    48    54
//	      7    14    21    28    35    42    49    56    63
//	      8    16    24    32    40    48    56    64    72
//	      9    18    27    36    45    54    63    72    81
	      
	      
	      for (int j = 1; j < 10; j++) {
	    	  for (int k = 1; k < 10; k++) {
	    		  System.out.printf("%6d", j*k);
	    	  }

	    	  System.out.println();
	      }
	}

}
