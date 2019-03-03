import java.util.Scanner;
/*
 * 把这个数 减去1，然后与原数字做与运算。
 * 如果结果为0，说明是2的整数次方
 */
public class Num {

	public static boolean isPower2(int n) {
		if (n < 0) {
			return false;
		}
		int m = n & (n - 1);
		return m == 0;

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("");
			int n = cin.nextInt();

			boolean ans = isPower2(n);
			System.out.println(n + "是不是2的整数次方？" + ans);
		}
	}
}
