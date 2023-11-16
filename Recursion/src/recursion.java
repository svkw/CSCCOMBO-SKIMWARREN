
public class recursion {

	public static void main(String[] args) {

		int result = sum(10);
		System.out.println(result);
		
		displayBinary(8);
		System.out.println();
		
		System.out.println("The answer is " + factorial(5));
		
		System.out.println("The answer is " + fibonacci(6));
		
	}

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
	
	public static void displayBinary(int value) {
	    if (value > 0) {
	        displayBinary(value / 2);
	        System.out.print(value % 2);
	    }
	}
	
	public static int factorial(int n) 
	{
		if (n == 0) {
			return 1;
		}
		int product = n * factorial(n - 1);
		return product;
	}
	
	public static int fibonacci(int term) {
		if (term == 0 || term == 1) {
			return 1;
		}
		return(fibonacci(term - 1) + fibonacci(term - 2));
	}
	
	// Iterative version
//	public static int fibonacci(int term) {
//		if (term == 0 || term == 1) {
//			return 1;
//		}
//		Deque<Integer> stack = new ArrayDeque<>();
//		stack.push(1);
//		stack.push(1);
//		int answer = 0;
//		
//		for (int i = 2; i <= term; i++) {
//			int term2 = stack.pop();
//			int term1 = stack.pop();
//			answer = term1 + term2;
//			stack.push(term1);
//			stack.push(term2);
//			stack.push(answer);
//		}
//		return answer;
//	}
	
}
