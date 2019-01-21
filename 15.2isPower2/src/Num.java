import java.util.Scanner;
/*
 * 一个数num如果为2的n次方，那么它只有一个1，其他位全是0；
 * 则num-1只有一个0，其他的都是1；
 * 所以，如果一个数为2的n次方，那么 n&(n-1)==0.
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
			System.out.print("输入数字：");
			int n = cin.nextInt();

			boolean ans = isPower2(n);
			System.out.println(n + "是不是2的倍数？" + ans);
		}
	}
}
