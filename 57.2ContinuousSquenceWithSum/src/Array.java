public class Array {
	private static void FindSeque(int ans) {
		if (ans < 3) {
			return;
		}

		int small = 1;
		int big = 2;
		int mid = (1 + ans) / 2;
		int curNum = big + small;

		while (small < mid) {
			if (curNum == ans) {
				for (int i = small; i <= big; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			while (small < mid && curNum > ans) {
				curNum -= small;
				small++;

				if (curNum == ans) {
					for (int i = small; i <= big; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
			}
			big++;
			curNum += big;
		}
	}

	public static void main(String[] args) {
		int ans = 18;
		FindSeque(ans);
	}

}
