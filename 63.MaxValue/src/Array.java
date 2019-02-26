
public class Array {

	private static int maxValue(int[] arr) {
		if (arr.length < 2) {
			return 0;
		}
		int minPrice  = arr[0];
		int maxValue = arr[1]- minPrice;
		

		for(int i=2;i<arr.length;i++){
			if(arr[i-1] < minPrice){
				minPrice = arr[i-1];
			}
			int curValue = arr[i] - minPrice;
			
			if(curValue > maxValue){
				maxValue = curValue;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int arr[] = { 9, 11, 8, 5, 7, 12, 16, 14 };

		System.out.println("最大价值为：" + maxValue(arr));
	}

}
