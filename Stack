package practise;
class Stack {
	private int topOfStack=-1;
	private int sizeOfArray;
	int stackArray[];
	Stack(int size) {
		this.sizeOfArray=size;
		stackArray=new int[sizeOfArray];
	}
	void push(int data) {
		if(topOfStack==sizeOfArray-1)
			System.out.println("Stack overflow");
		else
		{
			topOfStack++;
			stackArray[this.topOfStack]=data;
		
		}
	}
	void pop() {
		if(topOfStack==-1)
			System.out.println("Stack underflow");
		else
			topOfStack--;
	}
	void displayStack() {
		for(int start=0;start<=this.topOfStack;start++){
			System.out.println(stackArray[start]);}
	}
}

public class StackExample {
	public static void main(String... args) {
		Stack s=new Stack(10); //stack of size 10
		s.push(10);
		s.push(11);
		s.push(12);
		s.pop();
		s.displayStack();
	}
}
