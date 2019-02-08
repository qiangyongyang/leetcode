import java.util.Scanner;

public class Stringstr {

	public static void Reverse(char ch[], int sta, int end) {
		if (ch == null || ch.length == 0) {
			return;
		}

		while (sta < end) {
			char temp = ch[sta];
			ch[sta] = ch[end];
			ch[end] = temp;

			sta++;
			end--;
		}

	}

	public static void Rotate(char[] ch, int n) {
		if (n < 0 || n > ch.length) {
			System.out.println("输入错误");
			return;
		}
		if (ch == null || ch.length == 0) {
			return;
		}
		int sta = 0;
		int end = ch.length - 1;
		Reverse(ch, sta, sta + n - 1);
		Reverse(ch, n, end);
		Reverse(ch, sta, end);

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			String str = "abcdefg";
			char ch[] = str.toCharArray();
			System.out.print("输入左旋转的位数：");
			int n = cin.nextInt();
			Rotate(ch, n);
			for (char c : ch) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
