import java.util.Scanner;

public class Num {

	public static double power(int m, int n) {
		int ans=1;
		
		if(m ==0){         //����Ϊ0������0
			return 0;
		}
		if(n == 0){         //ָ��Ϊ0������1
			return 1;
		}
		if(n >0){                   //ָ��>0,
			for(int i= 0;i<n;i++){
				ans  =ans*m;
			}
			return ans;
		}
		if(n<0){                    //ָ����0��ȡ����
			for(int i=0;i<Math.abs(n);i++){
				ans =ans *m;
			}
			return 1.0/ans;
		}
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("�������:");
			int m = cin.nextInt();
			System.out.print("����ָ��:");
			int n = cin.nextInt();

			double ans = power(m, n);
			System.out.println(m + "��" + n + "�η��ǣ�" + ans);
		}
	}
}
