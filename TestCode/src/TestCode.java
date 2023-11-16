import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		// String array declaration and initialization
		String str = "";
		String[] gList = new String[8];			// grocery Array
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("enter 8 items for your grocery list (comma separated) for example");
		System.out.println("apple, pear, banana, oatmeal, toilet paper, sausage, gum, candy");
		str = scnr.nextLine();
		
		// call makeGroceryList method
		// return type is String Array
		gList = makeGroceryList(str);
		
		//testing what's in the gList
		for (int i = 0; i < gList.length; i++) {
			System.out.println(gList[i]);
		}

		
//		String[] fruits = {"pear", " ","hello", "world", "banana", "orange", "pear","apple"};

		// testing : adding String with new String[10]
//		for (int i = 0; i < fruits.length; i++) {
//		System.out.println("i is : " + i + ", element in i is " + fruits[i]);
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
//		for (int k = 0; k < fruits.length; k++) {
//			// printing out what are in fruits[]
//			System.out.println(fruits[k]);
//		}

	}

	public static String [] makeGroceryList(String strG) {
		String [] newGList = new String [8];
		newGList = strG.split(","); // Returns {"apple", "pear", "banana", etc}
		return newGList;
	}

}
