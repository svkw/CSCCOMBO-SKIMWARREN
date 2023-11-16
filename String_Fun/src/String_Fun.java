import java.util.Scanner;

public class String_Fun {

	private static final String Array = null;

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		String strA, strB;
		strA = "banana";
//    strA = "<<>>";
		strB = "apple";
		int[] intArr = {1,2,3,4,5,6};

		System.out.println(strA + " " + strB);
		String str = "Hello cat, dog World! xyz";
		
//		String replaced = str.replace("World", "Java"); // Returns "Hello, Java!"
//		System.out.println(replaced);

		System.out.println(makeConCat(strA, strB));
		System.out.println(firstLast6 (intArr));
		
		
//		System.out.println(compCatDog(str));
//		System.out.println(xyzThere(str));	// mostly working
		
//		System.out.println(strA.substring(0, 2));
//		System.out.println(makeOutWord(strA, strB));
//		System.out.println(makeTripple(strA));
//		System.out.println(makeHalf(strA));
//		System.out.println(makeNoEnd(strA));
//		System.out.println(makeCombi(strA, strB));
//		System.out.println(makeNoHead(strA, strB));
//		System.out.println(makeShiftR(strA));
//		System.out.println(makeShiftL(strA));
//		System.out.println(makeNoHeadEnd(strA));
		

	}

	private static boolean firstLast6(int[] intArray) {
		// Given an array of ints, return true if 6 appears as either the first 
		// or last element in the array. The array will be length 1 or more.

		// firstLast6([1, 2, 6]) → true
		// firstLast6([6, 1, 2, 3]) → true
		// firstLast6([13, 6, 1, 2, 3]) → false
		if ((intArray[0] == 6) || (intArray[intArray.length - 1] == 6)) return true;
		else return false;
	}

	private static boolean xyzThere(String xyzstr) {
		// Return true if the given string contains an appearance of "xyz" 
		// where the xyz is not directly preceeded by a period (.). 
		// So "xxyz" counts but "x.xyz" does not.

		// xyzThere("abcxyz") → true
		// xyzThere("abc.xyz") → false
		// xyzThere("xyz.abc") → true
		if (xyzstr.contains(".xyz") == true) {
			if (xyzstr.contains(".xyzx") == true) return true;
			else return false;
		}
		else if (xyzstr.contains("xyz") == true) return true;
		else return false;
	}

	private static String makeConCat(String str1, String str2) {
		// Given two strings, append them together (known as "concatenation") 
		// and return the result. However, if the concatenation creates a double-char, 
		// then omit one of the chars, so "abc" and "cat" yields "abcat".

		//		conCat("abc", "cat") → "abcat"
		//		conCat("dog", "cat") → "dogcat"
		//		conCat("abc", "") → "abc"
		
  		String conCat = str1 + str2;;
		if  ((str1.length() == 0) || (str2.length() == 0)) {
		  return conCat;
		}
		else if (str1.charAt(str1.length()-1) == str2.charAt(0)) {
	  		return str1 + str2.substring(1, str2.length());
		}
		else return conCat;
		
	}

	private static boolean compCatDog(String str) {
		// TODO Auto-generated method stub
		String subStr = "";
		int countCat = 0, countDog = 0;
		
		for (int i = 0; i < str.length() - 2; i++) {
			subStr = str.substring(i, i+3);
//			System.out.println("subStr : " + subStr + ", cat : " 
//					+ subStr.compareTo("cat") + ", dog : " + subStr.compareTo("dog"));
			if (subStr.compareTo("cat") == 0)
				countCat++;
			else if (subStr.compareTo("dog") == 0)
				countDog++;
			else continue;
		}
		
		if ((countCat > 0) && (countDog > 0)) return true;
		else return false;
		
	}

	private static String makeNoHeadEnd(String strC) {
		if (strC.length() <= 0) {
			return "";
		} else {
			return strC.substring(1, strC.length() - 1);
		}
	}

	private static String makeShiftL(String strC) {
		if (strC.length() <= 2) {
			return strC;
		} else {
			return strC.substring(strC.length() - 2, strC.length()) + strC.substring(0, strC.length() - 2);
		}
	}

	private static String makeShiftR(String strC) {
		if (strC.length() <= 2) {
			return strC;
		} else {
			return strC.substring(2, strC.length()) + strC.substring(0, 2);
		}
	}

	private static String makeNoHead(String strC, String strD) {
		return strC.substring(1, strC.length()) + strD.substring(1, strD.length());
	}

	private static String makeCombi(String strC, String strD) {
		if (strD.length() > strC.length()) {
			return strC + strD + strC;
		} else {
			return strD + strC + strD;
		}
	}

	private static String makeNoEnd(String strC) {
		// returns string without lead && end chars
		return strC.substring(1, strC.length() - 1);
	}

	private static String makeHalf(String strC) {
		// INPUT : String
		// OUTPUT : sub String
		// assumes strC.length() is even number
		// returns half of strC
		// makeHalf("banana") -> "ban"
		return strC.substring(0, strC.length() / 2);
	}

	private static String makeTripple(String strC) {
		// INPUT : String
		// OUTPUT : Concat'nd String
		// returns 2 last chars from strC three times
		// makeTripple("banana") -> "nanana"
		String strD = strC.substring(strC.length() - 2, strC.length());
		return strD + strD + strD;
	}

	private static String makeOutWord(String strC, String strD) {
		// INPUT : String strC & strD
		// OUTPUT : sub String
		// assumes strC.length() is 4
		// returs first two strC + strD + last two strC
		// makeOutWord("<<>>", "apple") -> "<<apple>>"
		return strC.substring(0, 2) + strD + strC.substring(2, 4);
	}


}
