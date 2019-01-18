
public class Array {

	public static int MorethanHalfOfNumber(int data[]) {
		if (data.length == 0) {
			return -1;
		}
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}

		max = max + 2;

		int count[] = new int[50];
		for (int i = 0; i < data.length; i++) {
			count[data[i] % max]++;
		}

		for (int i = 0; i < data.length; i++) {
			if (count[i] > data.length / 2) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int data[] = { 1, 1, 1, 1, 2, 2, 2, 2 };
		System.out.println("出现次数超过数组长度一半的数字是：" + MorethanHalfOfNumber(data));
	}
}
