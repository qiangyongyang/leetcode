import java.util.Scanner;

public class Array {
	public static int Sum_Solution(int n) {
		int sum = (int) (Math.pow(n, 2) + n);
		System.out.println("sum="+sum);
		return sum >> 1;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入n:");
			int n = cin.nextInt();
			int ans = Sum_Solution(n);
			System.out.println("答案是：" + ans);
		}
	}
}
