import java.util.Scanner;

public class MethodFun {

	public static void main(String[] args) {
		
		int mFun1, mFun2;
		Scanner scnr = new Scanner(System.in);
		
//		mFun1 = methodFun(3);
		System.out.println("type in positive integer");
		mFun1 = methodFun(scnr.nextInt());

		System.out.println("type in another positive integer");
		mFun2 = methodFun(scnr.nextInt());
		
		System.out.println("sq num is " + mFun1);
//		System.out.println("add num is " + methodFun2(2,3));
		System.out.println("add num is " + methodFun2(mFun1,mFun2));
		
	}

	public static int methodFun(int i) {
		// TODO Auto-generated method stub
		int sqNum;
		sqNum = i * i;
		return sqNum;
	}

	public static int methodFun2(int num1, int num2) {
		// TODO Auto-generated method stub
		int adNum;
		adNum = num1 + num2;
		return adNum;
	}

//	mFun2 = MethodFun2(2,3);
//	System.out.println("add num is " + mFun2);
		
}
