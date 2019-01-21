import java.util.Scanner;

public class Matrix {

	public static int Finddata(int arr[][], int num) {
		if (arr == null) {
			return -1;
		}
		int i = 0; // �еĳ���
		int j = arr[arr.length - 1].length-1; // �еĳ���

		while (i <arr.length && j >= 0) {
			if(num == arr[i][j]){
				System.out.println("λ���ڣ�"+i+"  "+j);
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
			System.out.print("����Ҫ���ҵ�����");
			int num = cin.nextInt();
			int index = Finddata(arr, num);
			if(index == -1){
				System.out.println("not exist");
			}
		}
		
	}
}
