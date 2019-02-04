public class Array {
	static int arr[] = { 7, 5, 6, 4 };
	static int temp[] = new int[arr.length];
	static int ans = 0; // 逆序对个数

	public static void MegerSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (right + left) / 2;
			MegerSort(arr, left, mid);
			MegerSort(arr, mid + 1, right);
			Meger(left, mid, right);
			copy(left, right);
		}
	}

	public static void copy(int left, int right) {
		for (int i = left; i <= right; i++) {
			arr[i] = temp[i];
		}
	}

	public static void Meger(int left, int mid, int right) {
		int i = left, j = mid + 1, k = left;

		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				ans = ans + mid - i + 1;
			}
		}

		if (i > mid) {
			for (int q = i; q <= right; q++) {
				temp[k++] = arr[q];
			}
		} else {
			for (int q = i; q <= mid; q++) {
				temp[k++] = arr[q];
			}
		}

	}

	public static void main(String[] args) {

		MegerSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("逆序对个数为：" + ans);

	}

}
