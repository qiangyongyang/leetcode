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
public class BinTree {
	Node root;

	public BinTree() {
		root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.lchild;
					if (current == null) {
						parent.lchild = newNode;
						newNode.parent = parent;
						return;
					}
				} else {
					current = current.rchild;
					if (current == null) {
						parent.rchild = newNode;
						newNode.parent = parent;
						return;
					}
				}
			}
		}

	}

	public void buildTree(int data[]) {
		for (int i = 0; i < data.length; i++) {
			insert(data[i]);
		}
	}

	public void InOrder(Node root) {
		if (root != null) {
			InOrder(root.lchild);
			System.out.print(root.data + " ");
			InOrder(root.rchild);
		}
	}

	public Node nextNode(Node cur){
		if(root == null){
			return null;
		}
		if(cur.rchild != null){
			Node ans = cur.rchild;
			while(ans.lchild != null){
				ans = ans.lchild;
			}
			return ans;
		}else {
			Node par = cur.parent;
			while(par != null  && cur == par.rchild){
				cur = par;
				par = par.parent;
			}
			return par;
		}
	}

	public static void main(String[] args) {
		int[] data = { 5, 8, 7, 4, 9, 3, 1, 6, 2 };
		BinTree bt = new BinTree();
		bt.buildTree(data);
		Node root = bt.root;

		System.out.println("二叉树中序遍历：");
		bt.InOrder(root);
		System.out.println();
		
		Node cur1 = root.rchild.lchild;                 //7
		Node cur2 = root.lchild.lchild.lchild.rchild;   //2
		Node cur3 = root.rchild.rchild;                 //9
		Node cur4 = root.lchild.lchild.lchild;
		System.out.println(cur1.data+"的"+"下一个节点是："+bt.nextNode(cur1).data);
		System.out.println(cur2.data+"的"+"下一个节点是："+bt.nextNode(cur2).data);
		//System.out.println(cur3.data+"的"+"下一个节点是："+bt.nextNode(cur3).data);
		System.out.println(cur4.data+"的"+"下一个节点是："+bt.nextNode(cur4).data);
	}

}
