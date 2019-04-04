import java.util.Arrays;
import java.util.Scanner;

public class ArrayAsParameter {
	
	public static void main(String[] args) {
		
		int A[] = {0, 1, 2, 3, 4, 5, 6};
		listArray(A);
		listArray2(A);
		
		int[] revA = reverseArray(A);
		listArray2(revA);
		
		Stack stack = new Stack(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		listStackArray(stack);
		
		sumOfArray(A);
		
		sumUpStack(stack);
		
		Scanner input = new Scanner(System.in);
		
		int A2[] = new int[6];
		
		for(int i = 0; i < A2.length; i++) {
			
			System.out.println("Enter value: ");
			A[i] = input.nextInt();
			
		}
		
		sumOfArray(A2);
		
	}
	
	public static void listArray (int x[]) {
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}
	
	public static void listArray2 (int[] x) {
		
		System.out.println(Arrays.toString(x));
		
	}
	
	public static int[] reverseArray(int[] x) {
		
		int[] reverse = new int[x.length];
		for(int i = 0, j = reverse.length - 1; i < x.length; i++, j--) {
			reverse[j] = x[i];
		}
		return reverse;
		
	}
	
	public static void listStackArray(Stack stack) {
		
		stack.show();
		
	}
	
	public static void sumOfArray(int[] ar) {
		
		int sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		
		System.out.println("The sum of " + Arrays.toString(ar) + " is " +  + sum);
		
	}
	
	public static void sumUpStack(Stack stack) {
		
		stack.sumOfStack();
		
	}

}
