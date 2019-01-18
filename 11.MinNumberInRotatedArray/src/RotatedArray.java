public class RotatedArray {
 
  public static int getTheMin(int data[]) {
    if (data == null || data.length == 0) {
      throw new RuntimeException("input error!");
    }
    // 如果只有一个元素，直接返回
    if (data.length == 1)
      return data[0];
    
    int result = data[0];
    
    int left = 0, right = data.length - 1;
    int mid = left;
    
    // 确保 left 下标对应的值在左边的递增子数组，right 对应的值在右边递增子数组
    while (data[left] >= data[right]) {
      // 确保循环结束条件
      if (right - left == 1) {
        return data[right];
      }
      // 取中间位置
      mid = (left + right) / 2;
      // 三值相等的特殊情况，则需要从头到尾查找最小的值
      if (data[mid] == data[left] && data[mid] == data[right]) {
        return midInorder(data, left, right);
      }
      // 代表中间元素在左边递增子数组
      if (data[mid] >= data[left]) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return result;
  }
 
  public static int midInorder(int[] data, int start, int end) {
    int result = data[start];
    for (int i = start ; i <= end; i++) {
      if (result > data[i])
        result = data[i];
    }
    return result;
  }
 
  public static void main(String[] args) {
   
    int[] array1 = {3, 4, 5, 1, 2};
    System.out.println(getTheMin(array1));
 
   
    int[] array2 = {3, 4, 5, 1, 1, 2};
    System.out.println(getTheMin(array2));
 
    
    int[] array3 = {3, 4, 5, 1, 2, 2};
    System.out.println(getTheMin(array3));
 
   
    int[] array4 = {1, 0, 1, 1, 1};
    System.out.println(getTheMin(array4));
 
    
    int[] array5 = {1, 2, 3, 4, 5};
    System.out.println(getTheMin(array5));
 
    
    int[] array6 = {2};
    System.out.println(getTheMin(array6));
 
    
    int[] array7 = {1, 1, 1, 1, 1, 1, 1};
    System.out.println(getTheMin(array7));
 
   
    int[] array8 = {1, 0, 1, 1, 1};
    System.out.println(getTheMin(array8));
 
  }
}