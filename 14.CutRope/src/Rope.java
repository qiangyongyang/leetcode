import java.util.Scanner;

/*
 * 当n>=5时，尽可能多裁剪长度为3的绳子；
 * 当剩下的长度等于4时，把绳子剪成长度为2的两条绳子
 */
public class Rope {

	public static int Multi(int n) {
		if (n <= 2)
			return -1;
		if (n == 3)
			return 2;
		if (n == 4)
			return 4;
		int ans = 1;
		int other = n % 3;   //other为0，1，2
		int cnt  = n/3;
		
		//当剩下的长度等于4时，把绳子剪成长度为2的两条绳子(直接返回4)
		if (other + 3 == 4) {
			for (int i = 0; i < cnt - 1; i++) {
				ans = ans*3;
			}
			ans = ans*4;
		}else{
			for (int i = 0; i < cnt; i++) {
				ans = ans*3;
			}
			if(other>0){
				ans = ans * other;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入绳子长度：");
			int n = cin.nextInt();

			int ans = Multi(n);
			System.out.println("分割最大值是：" + ans);
		}
	}
}
