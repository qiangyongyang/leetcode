import java.util.Scanner;

public class Array {

	private static int f(int n, int sum) {
		if (n < 1 || sum < n || sum > 6 * n) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		int resCount = 0;
		resCount = f(n - 1, sum - 1) + f(n - 1, sum - 2) + f(n - 1, sum - 3) + f(n - 1, sum - 4) + f(n - 1, sum - 5)
				+ f(n - 1, sum - 6);
		return resCount;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入n的值：");
			int n = cin.nextInt();

			for (int i = n; i <= 6 * n; i++) {
				System.out.print(f(n, i)+" ");
			}
			System.out.println();
		}
	}

}
