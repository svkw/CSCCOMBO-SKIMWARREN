import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArr = {7, 3, 5, 8, 1, 4, 2, 6};
		int [] newArr = new int [8];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
		System.out.println();
		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
