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

	public static boolean isSymmetrical(Node root){
		if(root == null){
			return true;
		}
		return isSymmetrical(root.lchild,root.rchild);
	}
	
	public static  boolean isSymmetrical(Node root1,Node root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.data != root2.data){
			return false;
		}
		return isSymmetrical(root1.lchild,root2.rchild) 
				 && isSymmetrical(root1.rchild, root2.lchild); 
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(2);
		Node node4 = new Node(5);
		Node node5 = new Node(7);
		Node node6 = new Node(7);
		Node node7 = new Node(5);

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

		System.out.println("bt1是不是对称二叉树？"+isSymmetrical(bt1.root));
		
		

	}
}
