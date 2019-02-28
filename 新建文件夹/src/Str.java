/*
 * 1.如果模式中的第二个字符不是'*'时：
 * 		a1.如果字符串的的一个字符与模式的第一个字符相匹配，则字符串和模式都后移一位，匹配剩下的
 * 		a2.如果不匹配，直接返回true
 * 2.如果模式中的第二个字符是'*'时：
 * 		2.1 如果字符串的第一个字符与模式的第一个字符匹配：
 * 			b1.模式后移两位，继续匹配
 * 			b2.字符串后移一位，模式后移两位
 * 			b3.字符串后移一位，模式不变
 * 		2.2 如果字符串的第一个字符与模式的第一个字符不匹配：
 * 			c1.模式后移两位，继续匹配。
 * 
 */
public class Str {

	public static boolean match(char[] ch, char[] pat) {
		if (ch == null || pat == null) {
			return false;
		}
		if ((ch == null || ch.length == 0) && (pat == null || pat.length == 0)) {
			return true;
		}
		int chIndex = 0;
		int patIndex = 0;

		return match(ch, chIndex, pat, patIndex);
	}

	public static boolean match(char[] ch, int chIndex, char[] pat, int patIndex) {
		if (chIndex == ch.length && patIndex == pat.length) {
			return true;
		}
		// 如果模式到尾，字符串没到尾，匹配失败
		if (chIndex != ch.length && patIndex == pat.length) {
			return false;
		}

		// 如果模式中的第二个字符是'*'时：
		if (patIndex + 1 < pat.length && pat[patIndex + 1] == '*') {
			if (ch[chIndex] == pat[patIndex] || pat[patIndex] == '.') {
				return match(ch, chIndex, pat, patIndex + 2) || match(ch, chIndex + 1, pat, patIndex + 2)
						|| match(ch, chIndex + 1, pat, patIndex); // 情况b1,b2,b3
			} else {
				return match(ch, chIndex, pat, patIndex + 2); // 情况c1
			}
		}

		// 第一个字符匹配，但模式第二个不是* 模式和字符串上都后移一位 情况a1
		if (chIndex != ch.length && (ch[chIndex] == pat[patIndex] || pat[patIndex] == '.')) {
			return match(ch, chIndex + 1, pat, patIndex + 1);
		} else {
			return false;// 第一个字符不匹配并且模式第二个位置不是* 情况a2
		}
	}

	public static void main(String[] args) {
		String str = "aaa";
		String pattern = ".*ac*a";

		char ch[] = str.toCharArray();
		char pat[] = pattern.toCharArray();

		boolean ans = match(ch, pat);
		System.out.println("匹配吗？" + ans);
	}

}
