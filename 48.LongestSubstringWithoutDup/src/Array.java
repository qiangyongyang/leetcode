/*
 1.若当前字符第一次出现，则最长非重复子字符串长度f(i) = f(i-1)+1。 
 2.若当前字符不是第一次出现，则首先计算当前字符与它上次出现位置之间的距离d:
 	若d大于f(i-1)，即说明前一个非重复子字符串中没有包含当前字符，则可以添加当前字符到前一个非重复子字符串中，所以，f(i) = f(i-1)+1。
 	若d小于或等于f(i-1)，即说明前一个非重复子字符串中已经包含当前字符，则不可以添加当前字符，所以，f(i) = d。
 */
public class Array {

	public static int LongestString(char[] ch) {
		if (ch == null || ch.length == 0) {
			return 0;
		}
		int curLength = 0;
		int maxLength = 0;

		int position[] = new int[26];
		for (int i = 0; i < 26; i++) {
			position[i] = -1;
		}

		for (int i = 0; i < ch.length; i++) {
			int curChar = ch[i] - 'a';
			
			int prePosition = position[curChar];
			
			int distance = i - prePosition;
			if(prePosition < 0 || distance > curLength){
				curLength++;
			}else{
				if(curLength > maxLength){
					maxLength =curLength;
				}
				curLength = distance;
			}
			position[curChar] = i;
		}
		return maxLength >curLength ? maxLength: curLength;
	}

	public static void main(String[] args) {
		String str = "arabcacfrc";
		char ch[] = str.toCharArray();
		int length = LongestString(ch);
		System.out.println("最大长度是：" + length);
	}

}
