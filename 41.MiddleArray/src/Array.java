import java.util.Comparator;
import java.util.PriorityQueue;

public class Array {
	private static int count = 0;

	// 大顶堆，存放左面的元素
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	});
	// 小顶堆，存放右面的元素
	static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		};
	});

	public static void Insert(int num) {
		count++;

		// 如果是偶数，插入到最小堆（右）.

		// 必须先插入最大堆，然后把最大堆的根元素插入最小堆
		if (count % 2 == 0) {
			maxHeap.add(num);
			int temp = maxHeap.poll();
			minHeap.add(temp);
		} else {
			// 如果是奇数，先放入最小堆，再把最小堆的根元素放入最大堆
			minHeap.add(num);
			int temp = minHeap.poll();
			maxHeap.add(temp);
		}
	}

	public static double MiddleNum(int data[]) {
		if (count % 2 == 0) {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		} else {
			return maxHeap.peek();
		}
	}

	public static void main(String[] args) {
		int data[] = { 1, 5, 2, 3, 4 };
		if (data.length == 0) {
			System.out.println("数组中没有中位数");
		} else {
			for (int i = 0; i < data.length; i++) {
				Insert(data[i]);
			}
			double middle = MiddleNum(data);
			System.out.println("中位数是：" + middle);
		}

	}
}
