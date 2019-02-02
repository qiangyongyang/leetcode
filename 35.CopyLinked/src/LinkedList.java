public class LinkedList {
	Node head = null;

	public void insert(Node toAdd) {
		if (head == null) {
			head = toAdd;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public void print(LinkedList list) {
		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// 1.复制原始链表的任意节点N，并创建新的节点N’，再把N’连接到N后面 // 1 1 2 2 3 3 4 4 5 5
	public static void cloneNode(LinkedList list) {
		Node head = list.head;
		Node temp = head;
		while (temp != null) {
			Node cloneNode = new Node(temp.data);
			cloneNode.next = temp.next;
			temp.next = cloneNode;
			temp = cloneNode.next;
		}
	}

	// 2.如果原始节点N的slbing指向S，则复制过后的N’的slbing指向S’。
	public static void ConnectSlbingNode(LinkedList list) {
		Node temp = list.head;
		while (temp != null) {
			Node cloneNode = temp.next;
			if (temp.slbing != null) {
				cloneNode.slbing = temp.slbing.next;
			}
			temp = cloneNode.next;
		}
	}

	//3.把第二步得到的链表拆分成两个链表，奇数位置上的节点组成第一个链表，偶数位置上组成第二个链表
	public static Node ReconnectNodes(LinkedList list) {
		Node temp = list.head;
		Node CloneHead = null;
		Node cloneNode = null;

		if(temp != null){
			cloneNode = CloneHead = temp.next;
			temp.next = cloneNode.next;
			temp = temp.next;
		}
		while(temp != null){
			cloneNode.next = temp.next;
			cloneNode = cloneNode.next;
			temp.next = cloneNode.next;
			temp = temp.next;
		}
		return CloneHead;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		LinkedList list = new LinkedList();
		list.insert(node1);
		list.insert(node2);
		list.insert(node3);
		list.insert(node4);
		list.insert(node5);

		node1.slbing = node3;
		node2.slbing = node5;
		node4.slbing = node2;

		list.print(list);

		cloneNode(list);
		list.print(list);

		ConnectSlbingNode(list);

		LinkedList cloneList = new LinkedList();
		cloneList.head = ReconnectNodes(list);
		System.out.println(cloneList.head.next.slbing.data);

	}

}
