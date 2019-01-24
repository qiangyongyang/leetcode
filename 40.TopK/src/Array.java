import java.util.Scanner;

public class Array {

	public static void CreateHeap(int data[], int i, int len) {
		int left, right, j;
		while ((left = 2 * i + 1) <= len) {
			right = left + 1;
			j = left;
			if (j < len && data[left] < data[right]) {
				j++;
			}
			if (data[i] < data[j]) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			} else {
				break;
			}
			i = j;
		}
	}

	public static void TopK(int data[], int k) {
		if (data.length == 0) {
			return;
		}
		for (int i = data.length / 2 - 1; i >= 0; i--) {
			CreateHeap(data, i, data.length - 1);
		}

		for (int i = data.length - 1; i >= (data.length - 1 - k); i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;

			CreateHeap(data, 0, i - 1);
		}

	}

	public static void main(String[] args) {
		int data[] = { 3, 1, 2, 4, 6, 5 };
		Scanner cin = new Scanner(System.in);
		while (true) {
			System.out.print("输入k的值：");
			int k = cin.nextInt();
			if (k < 1 || k > data.length) {
				System.out.println("输入异常");
			} else {
				TopK(data, k);
				for (int i = data.length - 1; i > data.length - 1 - k; i--) {
					System.out.print(data[i] + " ");
				}
				System.out.println();
			}

		}
	}
}
