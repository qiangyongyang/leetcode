import java.util.Scanner;

public class Stack<E> {
	Node<E> top = null;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(E data) {
		Node<E> newNode = new Node<E>(data);
		newNode.next = top;
		top = newNode;
	}

	public void pop() {
		if (isEmpty()) {
			return;
		}
		top = top.next;
	}

	public E numTop() {
		if (isEmpty()) {
			return null;
		}
		return top.data;
	}

	public void print() {
		while (top != null) {
			System.out.println(top.data);
			top = top.next;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		int pushStack[] = { 1, 2, 3, 4, 5 };
		int popStack1[] = { 4, 5, 3, 2, 1 };

		int k = 0;
		for (int i = 0; i < 5; i++) {
			s1.push(pushStack[i]);

			if (s1.numTop() == popStack1[k]) {
				s1.pop();
				k++;
			}
		}

		while (!s1.isEmpty()) {
			if (s1.numTop() == popStack1[k]) {
				s1.pop();
				k++;
			} else {
				break;
			}
		}

		if (s1.isEmpty()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
