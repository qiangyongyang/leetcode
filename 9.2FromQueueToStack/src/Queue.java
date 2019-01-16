import java.util.Scanner;

public class Queue<E> {
	Node<E> head = null;
	Node<E> tail = null;

	public boolean isEmpty() {
		return size() == 0;
	}

	public void put(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void pop() {
		if (isEmpty()) {
			return;
		}
		head = head.next;
	}

	public E numHead() {
		if (isEmpty()) {
			return null;
		}
		return head.data;
	}

	public int size() {
		Node<E> temp = head;
		int n = 0;
		while (temp != null) {
			n++;
			temp = temp.next;
		}
		return n;
	}

	public void print() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q1 = new Queue<>();
		Queue<Integer> q2 = new Queue<>();
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();

		for (int i = 1; i <= n; i++) {
			q1.put(i);
		}
		
		while (n > 1) {
			
			q2.head = q2.tail = null;   //这句话对于入队很重要，不然会发生假溢出
			
			for (int i = 1; i < n; i++) {
				q2.put(q1.numHead());
				q1.pop();
			}

			System.out.println("出队的值为：" + q1.numHead());
			q1.pop();
			
			q1.head = q1.tail = null;     //这句话对于入队很重要，不然会发生假溢出
			for (int i = 1; i < n; i++) {
				int num = q2.numHead();
				q1.put(num);
				q2.pop();
			}
			n--;
		}
		
		System.out.println("出队的值为：" + q1.numHead());
		q1.pop();
		
	}

}
