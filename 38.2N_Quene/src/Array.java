
public class Array {

	static int x[] = new int[1000];
	static int sum = 0;

	public static boolean place(int k) {
		for (int j = 1; j < k; j++) {
			if (Math.abs(k - j) == Math.abs(x[j] - x[k]) || (x[j] == x[k]))
				return false;
		}
		return true;
	}

	public static void backtrack(int i) {
		if (i > 8)
			sum++;
		for (int j = 1; j <= 8; j++) {
			x[i] = j;
			if (place(i)) {
				backtrack(i + 1);
			}
		}
	}

	public static void main(String[] args) {
		backtrack(1);
		System.out.println(sum);
	}

}
