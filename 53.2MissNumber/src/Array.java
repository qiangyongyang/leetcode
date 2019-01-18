import java.util.Scanner;

public class Array {

	public static int NotInArray(int data[]) {
		int left = 0;
		int right = data.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (mid == data[mid]) {
				left = mid + 1;
			} else {
				if (mid == 0 || mid - 1 == data[mid - 1]) {
					return mid;
				}
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int data[] = new int[50];
		System.out.print("输入数组大小：");
		Scanner cin =new Scanner(System.in);
		int n = cin.nextInt();
		if(n==1){                           //数组为空
			System.out.println("不在数组中的元素是：" + 0);
		}else{
			for(int i=0;i<n-1;i++){
				data[i]= cin.nextInt();
			}
			System.out.println("不在数组中的元素是：" + NotInArray(data));
		}
		
	}
}
