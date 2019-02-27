import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        // 要删除元素的位置
        int idx = 0;
     
        while (list.size() > 1) {

            // 只要移动m-1次就可以移动到下一个要删除的元素上
            for (int i = 1; i < m; i++) {
                idx = (idx + 1) % list.size(); // 【A】
            }

            list.remove(idx);
        }
        return list.get(0);
    }

    public static int lastRemaining2(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }

        int last = 0;
        for (int i = 2; i <=n ; i++) {
            last = (last + m)%i;
        }

        return last;
    }

    public static void main(String[] args) {
        test01();
        System.out.println();
        test02();
    }

    private static void test01() {
        System.out.print(lastRemaining(5, 3)+" "); // 最后余下3
        System.out.print(lastRemaining(5, 2)+" "); // 最后余下2
        System.out.print(lastRemaining(6, 7)+" "); // 最后余下4
        System.out.print(lastRemaining(6, 6)+" "); // 最后余下3
        System.out.print(lastRemaining(0, 0)); // 最后余下-1
    }

    private static void test02() {
        System.out.print(lastRemaining2(5, 3)+" "); // 最后余下3
        System.out.print(lastRemaining2(5, 2)+" "); // 最后余下2
        System.out.print(lastRemaining2(6, 7)+" "); // 最后余下4
        System.out.print(lastRemaining2(6, 6)+" "); // 最后余下3
        System.out.print(lastRemaining2(0, 0)); // 最后余下-1
    }
}
