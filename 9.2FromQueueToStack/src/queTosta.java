import java.util.*;

public class queTosta {
	
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		for (int i = 1; i <= 5; i++) {
			q1.add(i);
		}
		
		
		
		
		while(!q1.isEmpty()){
			int n = q1.size();
			for (int i = 0; i < n-1; i++) {
				q2.add(q1.poll());
			}
			System.out.println(q1.peek());
			q1.poll();
			
			for(int i = 0; i < n-1;i++){
				q1.add(q2.poll());
			}
			
		}
		 

	}

}
