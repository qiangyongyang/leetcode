public class LinkedList {
	Node head = null;
	
	public void add(Node toAdd){
		if(head == null){
			head = toAdd;
			return ;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	
	public void print(){
		Node temp = head;
    	int i = 1;
    	while(temp != null){
    		System.out.println("第"+i+"个结点的数值域的值为："+temp.data);
    		i++;
    		temp = temp.next;
    	}
	}
	
	public int length(){
    	int length = 0;
    	Node temp = head;
    	while(temp != null){
    		length++;
    		temp = temp.next;
    	}
    	return length;
    }
	
	
	
	public void findMiddleNode(){
		if(head == null){
			return ;
		}
		Node p = head;
		Node q = head;
		while(p.next != null && q.next != null){
			p = p.next;
			q = q.next;
			if(q.next != null){
				q = q.next;
			}
		}
		System.out.println("中间结点的值为："+p.data);
	}
	
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		Node node1 =new Node(1);
		Node node2 =new Node(2);
		Node node3 =new Node(3);
		Node node4 =new Node(4);
		Node node5 =new Node(5);
		Node node6 =new Node(6);
		Node node7 =new Node(7);
		Node node8 =new Node(8);
		Node node9 =new Node(9);
		ls.add(node1);
		ls.add(node2);
		ls.add(node3);
		ls.add(node4);
		ls.add(node5);
		ls.add(node6);
		ls.add(node7);
		ls.add(node8);
		
		System.out.println("插入后：");
		ls.print();
		ls.findMiddleNode();
	}
		
	
}
