
public class Array {

	public static void twoNums(int[] arr, int ans) {
		if (arr == null) {
			return;
		}
		int left = 0;
		int right = arr.length - 1;

		int temp;
		while ((temp = (arr[left] + arr[right])) != ans && left < right) {
			if (temp > ans) {
				right--;
			} else if (temp < ans) {
				left++;
			}
		}
		System.out.print(arr[left] + " " + arr[right]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 7, 11, 15 };
		int ans = 15;

		twoNums(arr, ans);
	}

}
