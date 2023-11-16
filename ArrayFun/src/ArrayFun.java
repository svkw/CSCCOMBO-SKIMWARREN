import java.util.Scanner;

public class ArrayFun {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      // numCount array holds integers
//	      int [] numCount = new int [5];
	      int [] numCount = {10, 20, 30, 40, 50};
	      
	      for (int i = 0; i < numCount.length; i++) {
	    	  System.out.println("index i is : " + i + ", element in index i is " + numCount[i]);
	    	  int numIndex = numCount[i];
	      }

//************************************
//	      CODINGBAT METHODS STRING
//************************************
//			String strF = "apple,banana,orange";
//			String[] fruits = strF.split(","); // Returns {"apple", "banana", "orange"}
//			
//			System.out.println(fruits[0] + fruits[1]);
//			

		
	      String strA, strB;
	      strA = "banana";
//	      strA = "<<>>";
	      strB = "apple";
	      
//	      System.out.println(strA[0]);//can't do this

//	      System.out.println(strA.substring(0, 2));
	      System.out.println(makeOutWord(strA, strB));
	      System.out.println(makeTripple(strA));
	      System.out.println(makeHalf(strA));
	      System.out.println(makeNoEnd(strA));
//	      System.out.println(makeCombi(strA, strB));
//	      System.out.println(makeNoHead(strA, strB));
//	      System.out.println(makeShiftR(strA));
//	      System.out.println(makeShiftL(strA));
//	      System.out.println(makeNoHeadEnd(strA));

	}

	private static String makeNoHeadEnd(String strC) {
		if (strC.length() <= 0) {
			return "";
		}
		else {
			return strC.substring(1, strC.length()-1);
		}
	}

	private static String makeShiftL(String strC) {
		if (strC.length() <= 2) {
			return strC;
		}
		else {
			return strC.substring(strC.length()-2, strC.length()) + strC.substring(0, strC.length()-2);
		}
	}

	private static String makeShiftR(String strC) {
		if (strC.length() <= 2) {
			return strC;
		}
		else {
			return strC.substring(2, strC.length()) + strC.substring(0, 2);
		}
	}

	private static String makeNoHead(String strC, String strD) {
		return strC.substring(1, strC.length()) + strD.substring(1, strD.length());
	}

	private static String makeCombi(String strC, String strD) {
		 if (strD.length() > strC.length()) {
			 return strC + strD + strC;
		 }
		 else {
			 return strD + strC + strD;
		 }
	}

	private static String makeNoEnd(String strC) {
		// returns string without lead && end chars
		return strC.substring(1, strC.length()-1);
	}

	private static String makeHalf(String strC) {
		// assumes strC.length() is even number
		// returns half of strC
		// makeHalf("banana") -> "ban"
		return strC.substring(0, strC.length()/2);
	}

	private static String makeTripple(String strC) {
		// returns 2 last chars from strC three times
		// makeTripple("banana") -> "nanana"
		String strD = strC.substring(strC.length()-2, strC.length());
		return strD + strD + strD;
	}

	private static String makeOutWord(String strC, String strD) {
		// assumes strC.length() is 4
		// returs first two strC + strD + last two strC
		// makeOutWord("<<>>", "apple") -> "<<apple>>"
		return strC.substring(0,2) + strD + strC.substring(2,4);
	}
	
//	public String makeOutWord(String out, String word) {
//		  return out.substring(0,2) + word + out.substring(2,4);
//		}


}
