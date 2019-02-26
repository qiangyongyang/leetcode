
public class Array {

	public static void Doplication(int data[]) {
		if (data.length == 0) {
			return;
		}

		int j = 0;
		int num[] = new int[10000000];
		for (int i = 0; i < data.length; i++) {
			num[data[i]]++;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int data[] = { 2, 3, 3, 0, 9, 8, 9 };
		Doplication(data);
	}
}
