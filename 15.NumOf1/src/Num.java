import java.util.Scanner;

/*
 * 把一个整数减去1，再和原整数做“与”运算，该整数的最右边的1，就会变成0；
 * 有几个1，执行几次这样的运算。
 */
public class Num {

	public static int NumOf1(int n) {

		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n & (n - 1);
		}
		return cnt;

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入数字n：");
			int n = cin.nextInt();

			int ans = NumOf1(n);
			System.out.println("数字中包含" + ans + "个1");
		}
	}
}
