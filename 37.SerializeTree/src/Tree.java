import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
	Node root;

	public Tree() {
		root = null;
	}

	public static void Serialize(Node root) {
		if (root == null) {
			System.out.print("$" + " ");
			return;
		}

		System.out.print(root.data + " ");
		Serialize(root.lchild);
		Serialize(root.rchild);
	}

	public static Node Deserialize(String str) {
		String[] deals = str.split(",");
		Queue<String> q = new LinkedList<String>();
		for (int i = 0; i < deals.length; i++) {
			q.add(deals[i]);
		}

		Node root = PreOrder(q);
		return root;

	}

	private static Node PreOrder(Queue<String> q) {
		String temp = q.poll();
		if ("$".equals(temp)) {
			return null;
		}

		Node root = new Node(Integer.valueOf(temp));
		root.lchild = PreOrder(q);
		root.rchild = PreOrder(q);

		return root;
	}

	
	
	
	
	
	private static void Inorder(Node root2) {
		if (root2 != null) {
			Inorder(root2.lchild);
			System.out.print(root2.data+" ");
			Inorder(root2.rchild);
		}
	}

	public static void main(String[] args) {
		Tree t = new Tree();

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);

		node1.lchild = node2;
		node2.lchild = node4;
		node1.rchild = node3;
		node3.lchild = node5;
		node3.rchild = node6;
		t.root = node1;

		Serialize(t.root);
		System.out.println();
		String str = "1,2,4,$,$,$,3,5,$,$,6,$,$";
		Node root2 = Deserialize(str);
		Inorder(root2);
	}

}
