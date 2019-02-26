import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Linkedlist{
	Node head = null;
	
	public void add(Node addNode){
		
		if(head == null){
			head = addNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = addNode;
		}
	}
	
	public void printReverse(Node listNode){
		List<Node> list =new ArrayList<Node>();
		Node temp = head ;
		while(temp != null){
			list.add(temp);
			temp = temp.next;
		}
		
		Collections.reverse(list);
		for (Node node : list) {
			System.out.println(node.data);
		}
	}
	
	
	public static void main(String[] args) {
		Linkedlist ls = new Linkedlist();
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
		ls.printReverse(node1);
	}
	
}
