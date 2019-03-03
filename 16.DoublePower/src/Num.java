import java.util.Scanner;

public class Num {

	public static double power2(int m, int n) {
		if(n == 0){
			return 1;
		}
		if (n == 1) {
			return m;
		}
		if (n == -1) {
			return 1.0 / m;
		}

		if (n % 2 == 0) {
			return power2(m, n / 2) * power2(m, n / 2);
		}
		if (n % 2 != 0) {
			return m * power2(m, n / 2) * power2(m, n / 2);
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入m:");
			int m = cin.nextInt();
			System.out.print("输入n:");
			int n = cin.nextInt();

			// double ans1 = power1(m, n);
			double ans2 = power2(m, n);

			// System.out.println(m + "的" + n + "次方是：" + ans1);
			System.out.println(m + "的" + n + "次方是：" + ans2);
		}
	}

}
