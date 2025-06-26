import java.awt.print.Book;
import java.util.*;

public class MagicalSubsequence {
    LongestCommonPrefix obj=new LongestCommonPrefix();
    private static int[] computeMaxPower(int n, int[] nums, int k) {
        int[] r = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            cleanDeque(deque, i, k);
            r[i] = calculatePower(deque, r, nums, i);
            maintainDequeOrder(deque, r, i);
        }

        return r;
    }
    private static void cleanDeque(Deque<Integer> deque, int currentIndex, int k) {
        while (!deque.isEmpty() && deque.peekFirst() < currentIndex - k) {
            deque.pollFirst();
        }
    }
    private static int calculatePower(Deque<Integer> deque, int[] r, int[] nums, int currentIndex) {
        if (!deque.isEmpty()) {
            return Math.max(r[deque.peekFirst()] + nums[currentIndex], nums[currentIndex]);
        } else {
            return nums[currentIndex];
        }
    }
    private static void maintainDequeOrder(Deque<Integer> deque, int[] r, int currentIndex) {
        while (!deque.isEmpty() && r[deque.peekLast()] <= r[currentIndex]) {
            deque.pollLast();
        }
        deque.addLast(currentIndex);
    }
    private static List<Integer> processQueries(int[] r, int[] queries) {
        List<Integer> result = new ArrayList<>();
        for (int query : queries) {
            result.add(r[query - 1]);
        }
        return result;
    }

    public static List<Integer> solve(int n, int[] nums, int k, int q, int[] queries) {
        int[] maxPower = computeMaxPower(n, nums, k);
        return processQueries(maxPower, queries);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        int q = scanner.nextInt();
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = scanner.nextInt();
        }
        List<Integer> result = solve(n, nums, k, q, queries);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
