
//linear queue

class linearQueue {
	private int queueArray[];
	private int front;
	private int rear;
	linearQueue(int size) {
		queueArray=new int[size];
		front=-1;
		rear=-1;
	}
	void push(int element) {
		
		if(front==-1 && rear==-1) {
			front++;
			queueArray[++rear]=element;
		}
		else {
			queueArray[++rear]=element;
		}
			
	}
	void pop() {
		if(front==rear) {
			System.out.println("queue underflow");
		}
		else {
			front++;
		}
		
	}
	void display() {
		for(int i=front;i<=rear;i++) 
			System.out.println(queueArray[i]);
	}
}

public class QueueArray {
	public static void main(String... args) {
		linearQueue queue=new linearQueue(10);
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.pop();
		queue.display();
	}
}

