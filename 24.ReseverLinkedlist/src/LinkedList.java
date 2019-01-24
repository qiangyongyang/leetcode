/*
 * 1.纭畾鏈夋棤鐜紝涓�涓蛋涓�姝ワ紝涓�涓蛋涓ゆ锛岀湅浼氫笉浼氱浉閬囷紱
 * 2.纭畾鐜腑缁撶偣n锛屼粠鐩搁亣鍑哄彂璁℃暟锛屽啀娆＄浉閬囨鏁颁负n
 * 3.涓�涓厛璧皀姝ワ紝鐒跺悗涓や釜涓�璧疯蛋锛岀浉閬囧嚭鍗充负鍏ュ彛鐐�
 */
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
    		System.out.println("绗�"+i+"涓粨鐐圭殑鏁板�煎煙鐨勫�间负锛�"+temp.data);
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
		
		
		
		Node temp = head;
    	int i = 1;
    	while(temp != null){
    		System.out.println("绗�"+i+"涓粨鐐圭殑鏁板�煎煙鐨勫�间负锛�"+temp.data);
    		i++;
    		temp = temp.next;
    	}
		
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
		ls.add(node9);
		
		System.out.println("鎻掑叆鍚庯細");
		ls.print();
		System.out.println("鍙嶈浆鍚庯細");
		ls.reverseList();
		
	}
		
}
