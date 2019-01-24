
public class Array {
	public static void Reorder(int arr[]) {
		if (arr.length == 0) {
			return;
		}
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] % 2 != 0) {
				i++;
			}

			if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
				j--;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 3, 4, 5, 3, 7, 8, 9 };

		Reorder(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
