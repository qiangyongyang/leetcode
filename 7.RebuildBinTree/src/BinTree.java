/*
	1.在先序或者后序序列中找到根节点。
	2.根据根节点，将之分成左右两部分。
	3.把分成的左右两部分，再去先序或者后序序列中找根节点
*/
public class BinTree {
	Node root;

	public BinTree() {
		root = null;
	}

	public void PostOrder(Node root) {
		if (root != null) {
			PostOrder(root.lchild);
			PostOrder(root.rchild);
			System.out.print(root.data + " ");
		}
	}

	public int findIndexInArray(int In[], int rootData, int begin, int end) {
		for (int i = begin; i <= end; i++) {
			if (In[i] == rootData) {
				return i;
			}
		}
		return -1;
	}

	public Node initTree(int[] Pre, int start1, int end1, int[] In, int start2, int end2) {
		int rootData = Pre[start1];
		Node root = new Node(rootData);
		Node left, right;
		int index = findIndexInArray(In, rootData, start2, end2);

		if (index == start2) {
			left = null;
		} else {
			left = initTree(Pre, start1 + 1, start1 - start2 + index, In, start2, index - 1);
		}

		if (index == end2) {
			right = null;
		} else {
			right = initTree(Pre, start1 - start2 + index + 1, end1, In, index + 1, end2);
		}

		root.lchild = left;
		root.rchild = right;

		return root;
	}

	public static void main(String[] args) {
		BinTree bt = new BinTree();
		int[] Pre = { 1, 2, 4, 8, 9, 5, 10, 3, 6, 7 };
		int[] In = { 8, 4, 9, 2, 10, 5, 1, 6, 3, 7 };
		Node root = bt.initTree(Pre, 0, 9, In, 0, 9);
		System.out.println("二叉树后续遍历："); // 8 9 4 10 5 2 6 7 3 1
		bt.PostOrder(root);
	}

}
