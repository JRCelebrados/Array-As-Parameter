import java.util.Arrays;

public class ArrayAsParameter {
	
	public static void main(String[] args) {
		
		int A[] = {0, 1, 2, 3, 4, 5, 6};
		listArray(A);
		listArray2(A);
		
		int[] revA = reverseArray(A);
		listArray2(revA);
		
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

}
