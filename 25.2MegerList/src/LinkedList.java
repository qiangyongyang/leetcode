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
	
	
	public void reverseList(){
		if(head == null){
			return ;
		}
		Node p = head.next;
		head.next = null;
		Node q = p;
		while(q != null){
			q = q.next;
			p.next = null;
			p.next = head;
			head = p;
			p = q;
		}
		
	}
	
	
	public Node MegerLinkedList(Node head1,Node head2){
		if(head1 == null){
			return head2;
		}
		else if(head2 == null){
			return head1;
		}else if(head1 == null && head2 == null){
			return null;
		}
		
		
		Node h = null;
		if(head1.data > head2.data){
			h=head1;
			h.next = MegerLinkedList(head1.next, head2);
		}else{
			h = head2;
			h.next = MegerLinkedList(head1, head2.next);
		}
    	return h;
	}
	
	
	

	public static void main(String[] args) {
		LinkedList ls1 = new LinkedList();
		LinkedList ls2 = new LinkedList();
		LinkedList ls3 = new LinkedList();
		Node node1 =new Node(1);
		Node node2 =new Node(3);
		Node node3 =new Node(5);
		Node node4 =new Node(7);
		Node node5 =new Node(2);
		Node node6 =new Node(4);
		Node node7 =new Node(6);
		Node node8 =new Node(8);
		
		ls1.add(node1);
		ls1.add(node2);
		ls1.add(node3);
		ls1.add(node4);
		
		ls2.add(node5);
		ls2.add(node6);
		ls2.add(node7);
		ls2.add(node8);
		
		System.out.println("插入后：");
		ls1.print();
		ls2.print();
		System.out.println("合并后：");
		ls1.reverseList();
		ls2.reverseList();
		ls3.head = ls3.MegerLinkedList(ls1.head, ls2.head);
		ls3.print();
		
	}
		
}
