import java.util.Scanner;
/*
 * һ����num���Ϊ2��n�η�����ô��ֻ��һ��1������λȫ��0��
 * ��num-1ֻ��һ��0�������Ķ���1��
 * ���ԣ����һ����Ϊ2��n�η�����ô n&(n-1)==0.
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
			System.out.print("�������֣�");
			int n = cin.nextInt();

			boolean ans = isPower2(n);
			System.out.println(n + "�ǲ���2�ı�����" + ans);
		}
	}
}
