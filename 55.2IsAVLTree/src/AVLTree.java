
public class AVLTree {
	Node root = null;

	public boolean isAVLTree_Low(Node root) {
		if (root == null) {
			return true;
		}
		int left = TreeDepth(root.lchild);
		int right = TreeDepth(root.rchild);
		int diff = right - left;
		if (diff > 1 || diff < -1) {
			return false;
		}
		return isAVLTree_Low(root.lchild) && isAVLTree_Low(root.rchild);
	}

	public static int TreeDepth(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.lchild == null && root.rchild == null) {
			return 1;
		}
		return 1 + Math.max(TreeDepth(root.lchild), TreeDepth(root.rchild));
	}

	public boolean isBST(Node root) {
		/*
		 * 将中序遍历的结果放入list，判断list是不是升序的？从而得到是不是BST
		 */
		return true;
	}

	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		Node node7 = new Node(7);
		Node node5 = new Node(5);
		Node node8 = new Node(8);
		Node node3 = new Node(6);
		Node node6 = new Node(6);
		Node node10 = new Node(10);
		Node node1 = new Node(1);
		/*
			    7 
			   / \ 
			  5   8 
			 / \   \ 
			3   6  10
			  
		 
		*/
		avl.root = node7;
		node7.lchild = node5;
		node7.rchild = node8;
		node5.lchild = node3;
		node5.rchild = node6;
		node8.rchild = node10;

		System.out.println(TreeDepth(avl.root));
		System.out.println("(low)是不是一颗AVL？" 
				+ (avl.isAVLTree_Low(avl.root) && avl.isBST(avl.root)));
	}

}
