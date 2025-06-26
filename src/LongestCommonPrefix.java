import java.util.*;
public class LongestCommonPrefix {
    private static int commonPrefixLength(String a, String b) {
        int i = 0;
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return i;
    }
    public static int[] solve(int N, String[] arr) {
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            List<String> tempList = new ArrayList<>(Arrays.asList(arr));
            tempList.remove(i);
            Collections.sort(tempList);

            int maxLength = 0;
            for (int j = 0; j < tempList.size() - 1; j++) {
                maxLength = Math.max(maxLength, commonPrefixLength(tempList.get(j), tempList.get(j + 1)));
            }
            result[i] = maxLength;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextLine();
        }

        int[] result = solve(N, arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
