import java.util.Scanner;

/*
 * ��n>=5ʱ�������ܶ�ü�����Ϊ3�����ӣ�
 * ��ʣ�µĳ��ȵ���4ʱ�������Ӽ��ɳ���Ϊ2����������
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
		int other = n % 3;   //otherΪ0��1��2
		int cnt  = n/3;
		
		//��ʣ�µĳ��ȵ���4ʱ�������Ӽ��ɳ���Ϊ2����������(ֱ�ӷ���4)
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
			System.out.print("�������ӳ��ȣ�");
			int n = cin.nextInt();

			int ans = Multi(n);
			System.out.println("�ָ����ֵ�ǣ�" + ans);
		}
	}
}
