
public class Array {

	public static void OnlyOneNum(int[] arr) {
		int num[] = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			num[arr[i]]++;
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 6, 3, 2, 5, 5 };
		OnlyOneNum(arr);
	}

}
