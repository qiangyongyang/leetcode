import java.util.LinkedList;
import java.util.Queue;
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

	public void PostOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<>();
		s.push(root);
		Node cur;
		Node pre = null;
		while (!s.empty()) {
			cur = s.peek();
			if ((cur.lchild == null && cur.rchild == null)
					|| (pre != null && (pre == cur.lchild || pre == cur.rchild))) {
				System.out.print(cur.data + " ");
				s.pop();
				pre = cur;
			} else {
				if (cur.rchild != null) {
					s.push(cur.rchild);
				}
				if (cur.lchild != null) {
					s.push(cur.lchild);
				}
			}
		}
	}

	public void tranLevel(Node root) {
		Queue<Node> q = new LinkedList<>();
		Node p;
		if(root != null){
			System.out.print(root.data+ " ");
			q.add(root);
		}
		while(!q.isEmpty()){
			p = q.peek();
			q.poll();
			if(p.lchild != null){
				System.out.print(p.lchild.data+" ");
				q.add(p.lchild);
			}
			if(p.rchild != null){
				System.out.print(p.rchild.data+" ");
				q.add(p.rchild);
			}
		}

	}

	public static void main(String[] args) {
		Tree t = new Tree();
		int data[] = { 1, 2, 3, 4, 5, 6, 7 };
		t.buildTree(data);
		Node root = t.root;
		t.tranLevel(root);

	}
}
