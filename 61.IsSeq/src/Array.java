import java.util.Arrays;

public class Array {

	public static boolean IsSeq(int[] arr) {
		if (arr == null) {
			return false;
		}
		Arrays.sort(arr);
		int num0 = 0;
		int diffNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				num0++;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] > 1 && (arr[i] != 0 && arr[i - 1] != 0)) {
				diffNum = diffNum + (arr[i] - arr[i - 1] - 1);
			}
			if (arr[i] == arr[i - 1] && (arr[i] != 0 && arr[i - 1] != 0)) {
				return false;
			}
		}

		if (diffNum <= num0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 3, 0, 4, 5 };
		boolean flag = IsSeq(arr);
		System.out.println("是不是顺子？" + flag);
	}

}
