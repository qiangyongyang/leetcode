import java.util.Arrays;

public class Array {

	public static String PrintMindataber(int[] data) {
		if (data == null) {
			return null;
		}
		String str = new String();
		String pre, last;
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				
				pre = data[i] + "" + data[j];
				last = data[j] + "" + data[i];
				
				if (pre.compareTo(last) > 0) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			str += data[i];
		}
		return str;

	}

	public static void main(String[] args) {
		int[] data = { 3, 32, 321 };
		System.out.println(PrintMindataber(data));
	}

}
