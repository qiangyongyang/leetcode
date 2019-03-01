import java.util.Stack;

public class StackToQueue {
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		for (int i = 1; i <= 5; i++) {
			s1.push(i);
		}

		int n = s1.size();
		for (int i = 0; i < n - 1; i++) {
			s2.push(s1.pop());
		}
		
		System.out.println(s1.pop());
		
		while(!s2.empty()){
			System.out.println(s2.pop());
		}

	}

}
