import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		
		// String array declaration and initialization
//		String[] fruits = new String[10];
//		String[] fruits = {"pear", " ","hello", "world", "banana", "orange", "pear","apple"};
//
		// testing : adding String with new String[10]
//		for (int i = 0; i < fruits.length; i++) {
//		System.out.println(fruits[i]);
//			if (i == 0) {
//				fruits[i] = "a";
//			}
//			else {
//				// adding string to previous fruits[] + i String value
//				fruits[i] = fruits[i - 1] + String.valueOf(i);
//				System.out.println(fruits[i]);
//			}
//		}
//
//		// populating fruits[] with String separated with ,
//		String strF = "apple,banana,orange,kiwi,pear,6,7,8,9";
//		fruits = strF.split(","); // Returns {"apple", "banana", "orange"}

		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int row;
		String str;
		System.out.println("how many # rows? ");
		row = scnr.nextInt();
		if (row > 0) {
			while (row > 0){
				System.out.print("*");
				row--;
			}
		}
		else {
			System.out.println("");
		}
		System.out.println(row);

	}

}
