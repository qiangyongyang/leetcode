/*
 * 对字符串中的每个字符进行判断分析:
 * 1.e（E）后面只能接数字，并且不能出现2次
 * 2.对于+、-号，只能出现在第一个字符或者是e的后一位
 * 3.对于小数点，不能出现2次，e后面不能出现小数点
 * 4.
 */

public class Str {

	public static boolean isNumeric_3(char[] str) {
		/*// 标记符号、 小数点、 e是否出现过
		boolean sign = false, decimal = false, hasE = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'e' || str[i] == 'E') {
				if (i == str.length - 1)
					return false; // e后面一定要接数字
				if (hasE)
					return false; // 不能同时存在两个e
				hasE = true;
			} else if (str[i] == '+' || str[i] == '-') {
				// 第二次出现+-符号，则必须紧接在e之后
				if (sign && str[i - 1] != 'e' && str[i - 1] != 'E')
					return false;
				// 第一次出现+-符号，且不是在字符串开头，则也必须紧接在e之后
				if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E')
					return false;
				sign = true;
			} else if (str[i] == '.') {
				// e后面不能接小数点，小数点不能出现两次
				if (hasE || decimal){
					return false;
				}
				decimal = true;
			} else if (str[i] < '0' || str[i] > '9') // 不合法字符
				return false;
		}
		return true;*/
		
		
		
	}

	public static void main(String[] args) {
		String str = "+12.1e-16";
		char[] ch = str.toCharArray();
		System.out.println(isNumeric_3(ch));
	}
}
