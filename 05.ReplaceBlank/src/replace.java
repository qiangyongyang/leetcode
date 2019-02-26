public class replace {

	public static void Replace(char[] c, int len1, int len2) {
		/*
		 * if (c.length == 0) { return; } int newlen = len2 - 1;
		 * 
		 * for (int i = len1 - 1; i >= 0; i--) { if (c[i] == ' ') { c[newlen--]
		 * = '0'; c[newlen--] = '2'; c[newlen--] = '%'; } else { c[newlen--] =
		 * c[i]; } }
		 * 
		 * for (int i = 0; i < len2; i++) { System.out.print(c[i]); }
		 */
		if (c.length == 0 || c == null) {
			return;
		} else {
			int newlen = len2 - 1;

			for (int i = len1 - 1; i >= 0; i--) {
				if(c[i] == ' '){
					c[newlen--] = '0';
					c[newlen--] = '2';
					c[newlen--] = '%';
				}else{
					c[newlen--] = c[i];
				}
			}
			
			for(int i=0;i<len2;i++){
				System.out.print(c[i]);
			}
		}

	}

	public static void main(String[] args) {
		String str = new String("we are the world");
		int len1 = str.length();
		int cnt = 0;
		for (int i = 0; i < len1; i++) {
			if (' ' == str.charAt(i)) {
				cnt++;
			}
		}
		int len2 = len1 + 2 * cnt;
		for (int i = 0; i < 2 * cnt; i++) {
			str = str + ' ';
		}
		char c[] = str.toCharArray();
		Replace(c, len1, len2);

	}
}
