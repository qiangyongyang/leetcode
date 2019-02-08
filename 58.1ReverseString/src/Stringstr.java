public class Stringstr {

	public static void Reverse(char[] ch, int sta, int end) {
		if (ch == null) {
			return;
		}
		while (sta < end) {
			char temp = ch[sta];
			ch[sta] = ch[end];
			ch[end] = temp;

			sta++;
			end--;
		}
	}

	public static void ReverseString(char[] ch) {
		if (ch == null) {
			return;
		}
		int sta = 0;
		int end = ch.length - 1;

		Reverse(ch, sta, end);
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();

		sta = 0;
		end = 0;
		while (sta != ch.length - 1) {
			if (ch[end] == ' ') {
				Reverse(ch, sta, end - 1);
				sta = end;
			} else if (end == ch.length - 1) {
				Reverse(ch, sta, end);
				sta = end;
			} else if (ch[sta] == ' ') {
				sta++;
				end++;
			} else {
				end++;
			}

		}
	}

	public static void main(String[] args) {
		String str = "Tom is a student.";
		char ch[] = str.toCharArray();
		ReverseString(ch);
		System.out.println();
		for (char c : ch) {
			System.out.print(c + " ");
		}
	}

}
