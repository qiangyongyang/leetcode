import java.util.Scanner;

public class Array {
	public static int NumOfK(int data[], int k) {
		if(lastIndex(data, k)==-1 || startIndex(data, k)==-1){
			return 0;
		}
		return lastIndex(data, k) - startIndex(data, k) + 1;
	}

	public static int startIndex(int[] data, int k) {
		int left = 0;
		int right = data.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (k > data[mid]) {
				left = mid + 1;
			} else if (k < data[mid]) {
				right = mid - 1;
			} else {
				while (mid - 1 >= 0 && data[mid - 1] == k) {
					mid--;
				}
				return mid;
			}
		}
		return -1;
	}

	public static int lastIndex(int[] data, int k) {
		int left = 0;
		int right = data.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (k > data[mid]) {
				left = mid + 1;
			} else if (k < data[mid]) {
				right = mid - 1;
			} else {
				while (mid + 1 <= data.length - 1 && data[mid + 1] == k) {
					mid++;
				}
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 3, 3, 6, 7, 8, 8 };

		while (true) {
			System.out.print("输入要查找的数：");
			Scanner cin = new Scanner(System.in);
			int k = cin.nextInt();
			if (k > data[data.length - 1] || k < data[0]) {
				System.out.println("查询无果");
			} else {
				System.out.println(k + "出现的次数为：" + NumOfK(data, k));
			}
		}

	}
}
