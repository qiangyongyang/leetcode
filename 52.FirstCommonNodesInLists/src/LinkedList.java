
public class LinkedList {
	Node head = null;

	private int length(Node head) {
		Node temp = head;
		int len = 0;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}

	private static Node theFirstCommonNode(LinkedList list1, LinkedList list2) {
		int len1 = list1.length(list1.head);
		int len2 = list2.length(list2.head);

		int diff = len1 - len2;
		Node temp = null;
		boolean flag = false; // 判断是1动了 还是2动了
		if (diff > 0) {
			for (int i = 0; i < diff; i++) {
				temp = list1.head;
				temp = temp.next;
				flag = true; // 1动了
			}
		} else {
			for (int i = 0; i < Math.abs(diff); i++) {
				temp = list2.head;
				temp = temp.next;
				flag = false; // 2动了
			}
		}

		Node start1 = temp;
		Node start2 = null;
		if (flag) {
			start2 = list2.head;
		} else {
			start2 = list1.head;
		}

		while (start1 != null) {
			if (start1.data == start2.data) {
				return start1;
			}
			start1 = start1.next;
			start2 = start2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node6;
		node6.next = node7;

		node4.next = node5;
		node5.next = node6;

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		list1.head = node1;
		list2.head = node4;

		Node FirstCommon = theFirstCommonNode(list1, list2);
		System.out.println("两个链表的第一个公共结点的位置是：" + FirstCommon.data);

	}

}
