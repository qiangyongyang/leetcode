import java.util.Scanner;
/*
 * ��һ��������ȥ1���ٺ�ԭ�����������㣬��Ѹ����������ұߵ�1���0��
 * һ�������У��ж��ٸ�1����ִ�ж��ٴ������Ĳ�����
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
			System.out.print("�������֣�");
			int n = cin.nextInt();

			int ans = NumOf1(n);
			System.out.println("����" + ans + "��1");
		}
	}
}
