import java.util.Scanner;

public class Num {

	public static int ChangeStr(char[] ch) {
		int length = ch.length;
		int ans[] = new int[length];
		// 12258
		for (int i = length - 1; i >= 0; i--) {
			int count = 0;
			if (i == length - 1) {
				count = 1;
			} else {
				count += ans[i + 1];
			}

			if (i < length - 1) {
				int digit1 = ch[i] - '0';
				int digit2 = ch[i + 1] - '0';
				int temp = digit1 * 10 + digit2;
				if (temp >= 10 && temp <= 25) {
					if (i < length - 2) {
						count += ans[i + 2];
					} else {
						count++;
					}
				}
			}
			ans[i] = count;
		}
		return ans[0];
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入要翻译的数字：");
			int num = cin.nextInt();
			if (num < 0) {
				System.out.println("输入错误");
			} else {
				String str = Integer.toString(num);
				char ch[] = str.toCharArray();
				int ans = ChangeStr(ch);
				System.out.println("数字有" + ans + "种不同的翻译方法");
			}

		}
	}

}