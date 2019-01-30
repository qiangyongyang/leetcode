/*
 * f(i,j)=ma(f(i-1,j),f(i,j−1))+g(i,j)
 *其中 f(i,j)是要求解的最大值， f(i,j−1)是到达 (i,j)点左边点时得到最大礼物价值；
 *而 f(i−1,j)是到达 (i,j)点上边点时得到最大礼物价值，g(i,j)是(i,j) 点礼物的价值
 */

public class Matrix {

	public static int maxValue(int mar[][]) {
		if (mar == null) {
			return -1;
		}
		int rows = mar.length;
		int cols = mar[0].length;
		
		int f[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = f[i - 1][j];
				}
				if (j > 0) {
					left = f[i][j - 1];
				}
				f[i][j] = Math.max(up, left) + mar[i][j];
			}
		}
		return f[rows - 1][cols - 1];
	}

	public static void main(String[] args) {
		int mar[][] = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 }, { 3, 7, 16, 5 } };
		System.out.println("礼物的最大价值是：" + maxValue(mar));
	}
}
