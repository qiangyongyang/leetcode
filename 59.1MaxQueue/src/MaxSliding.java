import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSliding {
	static int num[] = new int [50];
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("请输入滑窗大小：");
		int k = cin.nextInt();
		System.out.println("请输入数组的大小：");
		int n = cin.nextInt();
		for(int i = 0; i < n; i++){
			num[i] = cin.nextInt();
		}
		
		List<Integer> list = new ArrayList<>(); 
		
		for(int i = 0; i < (n-k+1); i++){
			int temp = 0;
			for(int j = i; j < (i+k); j++){
				if(num[j] > temp){
					temp = num[j];
				}
			}
			list.add(temp);
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
	}
}
