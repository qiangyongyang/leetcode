import java.util.Scanner;

public class Num {

	public static int min(int a, int b, int c) {
		int ans = Math.min(a, b);
		return Math.min(ans, c);
	}

	public static int UglyNum(int n) {
		 if (n <= 0) {
	            return 0;
	        }
	        int[] result = new int[n+10];
	        // 1作为第一个丑数
	        result[0] = 1;
	        // 初始2,3,5因子对应的乘数为第一个丑数，即1
	        int divisor2 = 0;
	        int divisor3 = 0;
	        int divisor5 = 0;
	   
	        for (int i = 1; i <= n ; i++) {
	            // 根据因子对应的乘数下表计算得出下一个丑数
	            int multiply2 = result[divisor2] * 2;
	            int multiply3 = result[divisor3] * 3;
	            int multiply5 = result[divisor5] * 5;
	            // 找出三个因子乘以上一个对应丑数后最小的那个丑数，以此来保证丑数有序
	            int min = Math.min(multiply2, Math.min(multiply3, multiply5));
	            // 将最小的丑数放入结果集中，用于下一次计算
	            result[i] = min;
	            
	            
	            // 找出对应此次计算最小丑数的因子，并移动指针指向下一次计算薪丑数对应的老丑数下标
	            if (multiply2 == result[i]) {
	                divisor2++;
	            }
	            if (multiply3 == result[i]) {
	                divisor3++;
	            }
	            if (multiply5 == result[i]) {
	                divisor5++;
	            }
	        }
	        return result[n];

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入位置：");
			int k = cin.nextInt();
			int ans = UglyNum(k);
			System.out.println("第" + k + "个丑数是：" + ans);
		}
	}
}
