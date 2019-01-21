import java.util.Scanner;

public class Frog {
	public static long Fibonacci(int n){
		if(n<=0){
			return -1;
		}
		long arr[] =new long [1000];
		arr[1]=1;
		arr[2]=2;
		for(int i=3;i<=n;i++){
			arr[i] = arr[i-1]+ arr[i-2];
		}
		return arr[n];
	}
	
	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while(true){
			System.out.print("请输入台阶层数：");
			int n = cin.nextInt();
			long num =Fibonacci(n);
			System.out.println(n+"层台阶共有"+num+"种跳法");
		}
		
	}
}
