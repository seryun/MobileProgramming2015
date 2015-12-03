package Generic;

class Stack<T> {
	private T data;
	public Stack() {
	}
	public Stack(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public T push(T data) {
		return this.data = data;
	}
	public T pop() {
		return data;
	}
}

public class Generic {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}

