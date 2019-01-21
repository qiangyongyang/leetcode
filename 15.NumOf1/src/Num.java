import java.util.Scanner;
/*
 * 把一个整数减去1，再和原整数做与运算，会把该整数的最右边的1变成0，
 * 一个整数中，有多少个1，就执行多少次这样的操作。
 */
public class Num {

	public static int NumOf1(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = (n - 1) & n;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入数字：");
			int n = cin.nextInt();

			int ans = NumOf1(n);
			System.out.println("包含" + ans + "个1");
		}
	}
}
