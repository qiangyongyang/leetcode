import java.util.Stack;

public class Tree {
	Node root;

	public Tree() {
		root = null;
	}

	public boolean isPostOrder(int[] seq, int length) {
		if (seq == null) {
			return false;
		}

		int rootData = seq[length - 1];
		// 求树的左子树结点
		int i = 0;
		for (; i < length - 1; i++) {
			if (seq[i] > rootData) {
				break;
			}
		}
		// 求树的右子树结点
		for (int j = i; j < length - 1; j++) {
			if (seq[j] < rootData) {
				return false;
			}
		}
		// 判断左子树是不是BST
		boolean left = true;
		if (i > 0) {
			left = isPostOrder(seq, i);
		}
		// 判断右子树是不是BST
		boolean right = true;
		if (i < length - 1) {
			right = isPostOrder(seq, length - 1 - i);
		}

		return (left && right);
	}

	public static void main(String[] args) {
		Tree t1 = new Tree();
		int seq[] = { 5, 4, 6, 9, 11, 10, 8 };
		boolean ans = t1.isPostOrder(seq, seq.length);
		System.out.println("序列是不是BST的后序遍历？" + ans);
	}

}
