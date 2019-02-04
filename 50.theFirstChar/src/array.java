
public class array {

	public static char FirstChar(String str) {
		int num[] = new int[100000];
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			num[c[i] - 'a']++;
		}
		
		int i=0;
		for (char ch = c[i]; i!= c.length; i++) {
			if (num[ch-'a'] == 1) {
				return ch;
			}
		}
		return '0';

	}

	public static void main(String[] args) {
		String str = "rrfff";
		System.out.println("第一次出现的不重复字符是："+FirstChar(str));
	}

}
