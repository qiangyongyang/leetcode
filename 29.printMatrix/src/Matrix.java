public class Matrix {

	public static void PrintMatrix(int mar[][]) {
		if (mar == null) {
			return;
		}

		int rows = mar.length; // 行
		int cols = mar[0].length; // 列
		int start = 0;
		while (rows > start * 2 && cols > start * 2) {
			printfNum(mar, rows, cols, start);
			start++;
		}
	}

	public static void printfNum(int[][] mar, int rows, int cols, int start) {
		int endX = cols - 1 - start; // 最大列
		int endY = rows - 1 - start; // 最大行

		for (int i = start; i <= endX; i++) {
			System.out.print(mar[start][i] + " ");
		}

		if (start < endY) {
			for (int i = start + 1; i <= endY; i++) {
				System.out.print(mar[i][endX] + " ");
			}
		}

		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; i--) {
				System.out.print(mar[endY][i] + " ");
			}
		}

		if (start < endX && start <= endY - 2) {
			for (int i = endY - 1; i >= start + 1; i--) {
				System.out.print(mar[i][start] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int mar[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		PrintMatrix(mar);
	}
}
