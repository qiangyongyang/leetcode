
public class Stack <E>{
	Node <E> top = null;
	static int n = 5;
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(E data){
		Node <E> newNode =new Node<E>(data);
		newNode.next = top;
		top = newNode;
	}
	
	public void pop(){
		if(isEmpty()){
			return ;
		}
		top = top.next;
	}
	
	public E numTop(){
		if(isEmpty()){
			return null;
		}
		return top.data;
	}
	
	public void print(){
		while(top != null){
			System.out.println(top.data);
			top = top.next;
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		for(int i = 1; i <= n; i++){
			s1.push(i);
		}
		
		
		
		for(int i = 0;i<n-1;i++){
			int num = s1.numTop();
			s2.push(num);
			s1.pop();
		}
		
		System.out.print(s1.numTop()+" ");
		
		while(!s2.isEmpty()){
			System.out.print(s2.numTop()+" ");
			s2.pop();
		}
		
	}
}

























