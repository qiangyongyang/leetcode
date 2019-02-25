import java.util.Stack;

public class Tree {
	BinaryTreeNode root;
	public Tree() {
		root = null;
	}
	
	/*public void PostInorder(Node root){
		Stack<Node> s = new Stack<>();
		Node cur;
		Node pre = null;
		s.push(root);
		while(!s.empty()){
			cur = s.peek();
			if ((cur.lchild == null && cur.rchild == null)
					|| (pre != null && (pre == cur.lchild || pre == cur.rchild))) {
				// 如果当前结点没有孩子结点或者孩子节点都已被访问过
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
	}*/
	
	/*	
	    4
	   / \
	  2   6
	 / \ / \
	1  3 5  7 
   */
	
	public BinaryTreeNode convert(BinaryTreeNode root){  
        BinaryTreeNode lastNode = null;  
        convert(root,lastNode); 
        
        BinaryTreeNode head = lastNode;
       
        return lastNode;  
    }  
    public void convert(BinaryTreeNode root,BinaryTreeNode lastNode){  
        if(root != null) {
        	BinaryTreeNode current = root;  
            if(current.lchild != null){
                convert(current.lchild,lastNode);  
            }
            current.lchild = lastNode;  
            if(lastNode != null) {
            	 lastNode.rchild = current;  
            }
            lastNode = current;
            
            if(current.rchild != null)  {
            	 convert(current.rchild,lastNode);  
            } 
        }        
    } 



	public static void main(String[] args) {
		
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		
		node4.lchild = node2;
		node2.lchild = node1;
		node2.rchild = node3;
		node4.rchild = node6;
		node6.lchild = node5;
		node6.rchild = node7;
		
		Tree t1= new Tree();
		t1.root = node4;
		
		System.out.println("后续遍历的结果是：");
		//t1.PostInorder(t1.root);
		System.out.println();
		
		BinaryTreeNode head =t1.convert(t1.root);
		System.out.println(head.data);
		
	}
}
