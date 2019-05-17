
public class TestStacic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(8);
		for (int i = 0; i < 5; i++) {
			mystack1.push(i);
		}

		for (int i = 0; i < 8; i++) {
			mystack2.push(i);
		}
		System.out.println("Stck is my stack1");
		for (int i = 0; i < 5; i++) {
			System.out.println(mystack1.pop());
		}
		System.out.println("Stck is my stack2");
		for (int i = 0; i < 8; i++) {
			System.out.println(mystack2.pop());
		}
	}
}

class Stack {
	private int stck[];
	private int tos;

	Stack(int size) {
		stck = new int[size];
		tos = -1;
	}

	void push(int item) {
		if (tos == stck.length - 1) {
			System.out.println("Stack is full");
		} else {
			stck[++tos] = item;
		}
	}

	int pop() {
		if (tos < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
