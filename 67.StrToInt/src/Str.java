import java.util.Scanner;

public class Str {

	public static void StrToInt(String str) {
		if (str.length() == 0 || str == null) {
			System.out.println("结果是："+ 0);
			return;
		}

		char ch[] = str.toCharArray();
		int ans = 0;
		int j;
		
		if (ch[0] == '-') {
			for (j = 1; j < ch.length; j++) {
				if (ch[j] < '0' || ch[j] > '9') {
					return;
				}
				ans = ans * 10 + (ch[j] - '0');
			}
			System.out.println("结果是：" + -ans);
		}else if (ch[0] == '+') {
			for (j = 1; j < ch.length; j++) {
				if (ch[j] < '0' || ch[j] > '9') {
					return;
				}
				ans = ans * 10 + (ch[j] - '0');
			}
			System.out.println("结果是：" + ans);
		}else{
			for (int i = 0; i < ch.length; i++) {
				
				if (ch[i] < '0' || ch[i] > '9') {
					return;
				}
				ans = ans * 10 + (ch[i] - '0');
			}
			System.out.println("结果是：" + ans);
		}
	}

	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		while(true){
			System.out.print("输入一段字符串：");
			String str = cin.nextLine();
			StrToInt(str);
		}
		
		
	}

}
