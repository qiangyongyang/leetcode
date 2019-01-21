import java.util.Scanner;

public class Matrix {

	public static int Finddata(int arr[][], int num) {
		if (arr == null) {
			return -1;
		}
		int i = 0; // 行的长度
		int j = arr[arr.length - 1].length-1; // 列的长度

		while (i <arr.length && j >= 0) {
			if(num == arr[i][j]){
				System.out.println("位置在："+i+"  "+j);
				return num;
			}else if(num<arr[i][j]){
				j--;
			}else{
				i++;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		/*
		 * 1 2 8 9 
		 * 2 4 9 12
		 * 4 7 10 13
		 * 6 8 11 15
		 */
		Scanner cin = new Scanner(System.in);
		while(true){
			System.out.print("输入要查找的数：");
			int num = cin.nextInt();
			int index = Finddata(arr, num);
			if(index == -1){
				System.out.println("not exist");
			}
		}
		
	}
}
