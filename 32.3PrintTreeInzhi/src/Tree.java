import java.util.Stack;

public class Tree {
	Node root;

	public Tree() {
		root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
		} else {
			Node cur = root;
			Node parent;
			while (true) {
				parent = cur;
				if (data < cur.data) {
					cur = cur.lchild;
					if (cur == null) {
						parent.lchild = newNode;
						return;
					}
				} else {
					cur = cur.rchild;
					if (cur == null) {
						parent.rchild = newNode;
						return;
					}
				}
			}
		}
	}

	public void buildTree(int data[]) {
		if (data != null || data.length > 0) {
			for (int i = 0; i < data.length; i++) {
				insert(data[i]);
			}
		}
	}

	public void tranLevel(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		int lineNumber = 1; // 行号，根为第一行
		s1.push(root);

		while (!s1.empty() || !s2.empty()) {
			if (lineNumber % 2 == 1) { // 奇数行，左孩子先入栈
				while (!s1.empty()) {
					Node temp = s1.pop();
					System.out.print(temp.data + " ");
					if (temp.lchild != null) {
						s2.push(temp.lchild);
					}
					if (temp.rchild != null) {
						s2.push(temp.rchild);
					}
				}
				System.out.println();
			} else { // 偶数行，右孩子先入栈
				while (!s2.empty()) {
					Node temp = s2.pop();
					System.out.print(temp.data + " ");
					if (temp.rchild != null) {
						s1.push(temp.rchild);
					}
					if (temp.lchild != null) {
						s1.push(temp.lchild);
					}
				}
				System.out.println();
			}
			lineNumber++;
		}
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		int data[] = { 4, 1, 2, 3, 5, 6, 7 };
		t.buildTree(data);
		Node root = t.root;
		t.tranLevel(root);

	}

}
