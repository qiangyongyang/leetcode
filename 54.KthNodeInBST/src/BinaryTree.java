import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *							5
 *						   / \
                          4   8
                         /   / \
                        3   7   9
                       /   /
                      1   6
                       \
                        2
*/
public class BinaryTree {
	Node root;
	static int i = 0;
	List<Integer> list =new ArrayList<>();
	public BinaryTree() {
		// TODO Auto-generated constructor stub
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

	public void buildTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}

	public void InOrder(Node root) {

		if (root != null) {
			InOrder(root.lchild);
			System.out.print(root.data + " ");
			list.add(root.data);
			InOrder(root.rchild);
		}
	}

	public int printTopK(int k) {
		if(k<1 || k> list.size()){
			System.out.println("位置错误");
			return (Integer) null;
		}
		return list.get(k-1);
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		int[] data = { 5, 8, 7, 4, 9, 3, 1, 6, 2 };
		
		bt.buildTree(data);
		Node root = bt.root;
		System.out.println("二叉树中序遍历：");
		bt.InOrder(root);
		System.out.println();

		Scanner cin = new Scanner(System.in);
		int k = cin.nextInt();

		System.out.println("第"+k+"个数是："+bt.printTopK(k));
	}

}
