import java.util.Scanner;

public class Matrix {

	public static int Finddata(int arr[][], int num) {
		if (arr == null) {
			return -1;
		}
		
		if(arr == null || arr.length == 0){
			return -1;
		}
		int i = 0;
		int j = arr[0].length-1;
		
		while(i < arr.length && j>= 0){
			if(num == arr[i][j]){
				System.out.println("位置是："+i+"行"+j+"列");
				return num;
			}else if(num > arr[i][j]){
				i++;
			}else{
				j--;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		/*
		 * 1 2 8 9 2 4 9 12 4 7 10 13 6 8 11 15
		 */
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入要查找的值：");
			int num = cin.nextInt();
			int index = Finddata(arr, num);
			if (index == -1) {
				System.out.println("not exist");
			}
		}

	}
}
