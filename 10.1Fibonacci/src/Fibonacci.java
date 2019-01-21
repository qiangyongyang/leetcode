import java.util.Scanner;

public class Fibonacci {
	
	public static long Fibonacci(int n){
		if(n<0){
			return -1;
		}
		long arr[] =new long [1000];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<n;i++){
			arr[i] = arr[i-1]+ arr[i-2];
		}
		return arr[n-1];
	}
	
	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while(true){
			System.out.print("������һ�����֣�");
			int n = cin.nextInt();
			long num =Fibonacci(n);
			System.out.println("쳲��������е�"+n+"���ǣ�"+num);
		}
		
	}
}
