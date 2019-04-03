
public class Stack {
	
	private int[] A;
	private int top = -1;
	
	public Stack(int size) {
		
		A = new int[size];
		
	}
	
	public void push(int x) {
		
		top++;
		A[top] = x;
		
	}
	
	public void pop() {
		
		top--;
		
	}
	
	public int top() {
		return A[top];
		
	}
	
	public boolean isEmpty() {
		
		return top == -1;
		
	}
	
	public void show() {
		
		for (int i = 0; i < A.length; i++) {
			
			System.out.print(A[i] + "\n");
			
		}
		
	}
	
	public void sumOfStack() {
		
		int sum = 0;
		
		for(int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		System.out.println("The sum of the stack is " + sum);
		
	}

}
