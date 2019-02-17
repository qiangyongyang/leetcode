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

	public void tranLevel(Node root) {
		if(root == null){
			return ;
		}
		Queue<Node> q = new LinkedList<>();
		Node p;

		q.add(root);
		
		int toPrint = 1;
		int nextLine = 0;
		while (!q.isEmpty()) {
			p = q.peek();
			System.out.print(p.data + " ");
			
			if (p.lchild != null) {
				q.add(p.lchild);
				nextLine++;
			}
			if (p.rchild != null) {
				q.add(p.rchild);
				nextLine++;
			}
			
			q.poll();
			--toPrint;
			if(toPrint == 0){
				System.out.println();
				toPrint = nextLine;
				nextLine = 0;
			}
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
