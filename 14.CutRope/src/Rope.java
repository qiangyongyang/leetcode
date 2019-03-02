import java.util.Scanner;

/*
 * 当n>=5时，多减长度为3的绳子，当剩下长度为4，则剪成2*2；
 */
public class Rope {

	public static int Multi(int n) {
		/*if (n <= 2)
			return -1;
		if (n == 3)
			return 2;
		if (n == 4)
			return 4;
		int ans = 1;
		int other = n % 3;   //otherΪ0��1��2
		int cnt  = n/3;
		
		
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
		}*/
		if(n < 2){
			return -1;
		}
		if(n == 3){
			return 2;
		}
		if(n == 4){
			return 4;
		}
		
		int other  = n % 3;
		int cnt  = n/3;
		int result = 1;
		
		if(other + 3 == 4){
			for(int i = 1; i< cnt ;i++){
				result *= 3;
			}
			result *= 4;
		}else{
			for(int i = 1; i<= cnt ;i++){
				result *= 3;
			}
			result *= other;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入绳子长度：");
			int n = cin.nextInt();

			int ans = Multi(n);
			System.out.println("最大乘积为：" + ans);
		}
	}
}
