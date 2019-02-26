
public class Array {

	public static void CreateB(int[] a) {
		int len = a.length;
		int b[] = new int[a.length];

		b[0] = 1;
		for (int i = 1; i < len; i++) {
			b[i] = b[i - 1] * a[i - 1];
		}

		int temp = 1;
		
		for(int j = len - 2; j >= 0; j--){
			temp = temp * a[j+1];
			b[j] *= temp;
		}

		for (int i : b) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		CreateB(a);
	}

}
