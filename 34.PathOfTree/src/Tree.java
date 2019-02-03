import java.util.Stack;

public class Tree {
	Node root;

	public Tree() {
		root = null;
	}

	public static void findPath(Node root, int expectSum) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		findPath(root, expectSum, s);
	}

	public static void findPath(Node root, int expectSum, Stack<Node> s) {
		if (root == null) {
			return;
		}
		if (root.lchild == null && root.rchild == null) {
			if (root.data == expectSum) {
				System.out.println("路径开始：");
				for (Node node : s) {                    //遍历当前栈中所有节点
					System.out.print(node.data + " ");
				}
				System.out.println(root.data);
			}
		} else {
			s.push(root);
			findPath(root.lchild, expectSum - root.data, s);
			findPath(root.rchild, expectSum - root.data, s);
			s.pop();
		}
	}

	public static void main(String[] args) {
		Tree t1 = new Tree();

		Node node1 = new Node(10);
		Node node2 = new Node(5);
		Node node3 = new Node(12);
		Node node4 = new Node(4);
		Node node5 = new Node(7);

		node1.lchild = node2;
		node1.rchild = node3;
		node2.lchild = node4;
		node2.rchild = node5;

		t1.root = node1;
		int expectSum = 22;
		findPath(t1.root, expectSum);

	}

}
