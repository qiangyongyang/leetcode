public class BinaryTree {
	Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public void InOrder(Node root) {
		if (root != null) {
			InOrder(root.lchild);
			System.out.print(root.data + " ");
			InOrder(root.rchild);
		}
	}

	public void mirror(Node root) {
		if (root == null) {
			return ;
		}
		if (root.lchild == null && root.rchild == null) {
			return ;
		}

		Node temp = root.lchild;
		root.lchild = root.rchild;
		root.rchild = temp;

		if (root.lchild != null) {
			mirror(root.lchild);
		}
		if (root.rchild != null) {
			mirror(root.rchild);
		}	
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);

		BinaryTree bt1 = new BinaryTree();

		bt1.root = node1;
		node1.lchild = node2;
		node1.rchild = node3;
		node2.lchild = node4;
		node2.rchild = node5;
		node3.lchild = node6;
		node3.rchild = node7;
		
		System.out.println("bt1中序遍历为：");
		bt1.InOrder(bt1.root);
		System.out.println();

		System.out.println("bt1镜像为：");
		bt1.mirror(bt1.root);
		bt1.InOrder(bt1.root);
		System.out.println();

	}
}
