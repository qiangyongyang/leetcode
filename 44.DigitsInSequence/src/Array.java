
public class Array {

	public static int lengthSum(int index) {
		if (index == 1) {
			return 10;
		}
		int cnt = 9;
		for (int i = 1; i < index; i++) {
			cnt = cnt * 10;
		}
		return index * cnt;
	}

	public static int IndexOfNum(int i) { // 以1001为例
		if (i < 0) {
			System.out.println("输入错误");
			return -1;
		}

		if (i < 10) {
			return i;
		}
		int currIndex = 10;
		int length = 2; // length表示1，2，3....位数
		int startNum = 10; // 2位数的开始数是10，3位数的开始数为100
		while (i > currIndex + lengthSum(length)) {
			currIndex = currIndex + lengthSum(length);
			startNum *= 10;
			length++;
		}
		// currIndex = 190
		// startNum = 100
		// length = 3
		int addNum = (i - currIndex) / length; // 270,即三位数的第270个数
		int ansNum = addNum + startNum;	  //270+100 =370
		return Integer.toString(ansNum).charAt(i - currIndex - addNum * length) - '0'; // 370的第一位数，即7																					
	}

	public static void main(String[] args) {
		for (int i = 8; i <= 1004; i++) {
			System.out.println("第" + i + "位数是：" + IndexOfNum(i));
		}
	}
}
