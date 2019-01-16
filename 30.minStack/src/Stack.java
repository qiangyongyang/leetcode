import java.util.Scanner;

public class Stack<E> {
	Node <E> top = null;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(E data){
		Node <E> newNode = new Node<E>(data);
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
		Stack<Integer> s1 =new Stack<Integer>();
		Stack<Integer> s2 =new Stack<Integer>();
		Scanner cin =new Scanner(System.in);
		System.out.println("输入栈的大小：");
		int n = cin.nextInt();
		System.out.print("输入要入栈的值：");
		for(int i = 1; i <= n; i++){
			int num =cin.nextInt();
			s1.push(num);
			
			if(s2.isEmpty()){
				s2.push(num);
			}else{
				if(num > s2.numTop()){
					s2.push(s2.numTop());
				}else{
					s2.push(num);
				}
			}
		}
		
		System.out.println("栈2的值为：");
		s2.print();
		
	}
}

