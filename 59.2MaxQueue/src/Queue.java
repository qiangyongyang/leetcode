import java.util.Scanner;

public class Queue<E> {
	static int num[] = new int[50];
	
	Node<E> head = null;
	Node<E> tail = null;

	public boolean isEmpty() {
		return head == tail;
	}

	public void put(E data) {
		Node<E> newNode = new Node<E>(data);
		if (head == null && tail == null) {
			head = tail = newNode;
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
		System.out.println("输入队列大小：");
		int n = cin.nextInt();
		System.out.println("输入队列的元素：");
		for (int i = 0; i < n; i++) {
			num[i] = cin.nextInt();
			q1.put(num[i]);
			
			if(q2.isEmpty()){
				q2.put(num[i]);
			}else{
				if(num[i] > q2.numHead()){
					q2.put(num[i]);
				}else{
					q2.put(q2.numHead());
				}
			}

		}

		q2.print();
	}

}










