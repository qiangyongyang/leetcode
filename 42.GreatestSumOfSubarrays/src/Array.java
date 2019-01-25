
public class Array {

	public static int MaxsumUlt(int[] arr) {
		int maxSum = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (sum < 0) {
				sum = arr[i];
			} else {
				sum += arr[i];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int data[] = { 1, -2, 3, 10, -4, 7, 2, -5 };
		if(data.length==0){
			System.out.println("数组中无数字");
		}else{
			System.out.println(MaxsumUlt(data));
		}
	}
}
