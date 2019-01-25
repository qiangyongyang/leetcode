import java.util.Scanner;

/*
 * 以534为例：
 * 	 1.在从1增长到n的过程中，534的个位从0-9变化了53次，记为cnt（个位）。每一轮变化中，1在个位出现一次，所以一共出现了53次。 
 *   现在个位为4，大于0，说明第54轮变化是从0-4，1又出现了1次。我们记1出现的次数为cnt（个位）=53+1=54. 
 *   2.对于十位来说，534的十位从00-90变化了5次，记为cnt（十位），每一轮变化中，1的位置在十位出现10次，所以一共出了50次，
 *   现在十位为3，大于0，说明第六次变化是从00-30，1又出现了10次，记1出现的次数为cnt（十位）=5*10+1*10 = 60；
 *   3.对于百位来说，534的百位从000-900变化了0次，记为cnt（百位），每一轮变化中，1在百位出现一次，所以一共出现了0次，
 *   现在百位为5，大于0，说明第一次变化是从000-500，1出现了100次，所以cnt（百位）=1*100 = 100.
 *   
 *   
 *   总计   numof1 =54+60+100 = 214
 *   
 */
public class Num {

	public static long NumOf1(int n) {
		int count=0;
		int base = 1; // 表示个位
		int round = n;
		while (round > 0) {
			int weight = round % 10; // round的最后一位数,从个位数开始
			round = round / 10;
			count = count + round * base;
			if (weight > 1) {
				count = count + base;
			} else if (weight == 1) {           //当中间的数为1时，说明不足10/100/1000.....次，要准确计算
				count = count + (n % base) + 1;
			}
			System.out.println(count);
			base *= 10; // 表示十位，百位
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入n的值:");
			int n = cin.nextInt();
			if (n < 1) {
				System.out.println("输入错误");
			} else {
				System.out.println("从1到" + n + "中1出现的次数为：" + NumOf1(n));
			}

		}
	}
}
