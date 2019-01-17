
public class BinaryTree {
	Node root;

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
	
	public void buildTree(int []data){
		for(int i=0;i<data.length;i++){
			insert(data[i]);
		}
	}
	
	
	
	public void InOrder(Node root){
		if(root !=null){
			InOrder(root.lchild);
			System.out.print(root.data+" ");
			InOrder(root.rchild);
		}
	}
	
	public int heigh(Node root){
		if(root == null)
			return 0;
		if(root.lchild ==null && root.rchild==null)
			return 1;
		return 1+Math.max(heigh(root.lchild),heigh(root.rchild));
		
	}
	
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		int[] data = { 5, 8, 7, 4, 9, 3, 1, 6, 2 };
		
		bt.buildTree(data);
		Node root = bt.root;
		System.out.println("二叉树中序遍历：");
		bt.InOrder(root);
		System.out.println();
		
		System.out.println("二叉树的深度为："+bt.heigh(root));
	}	

}
