import java.util.Arrays;

public class SortSpecificIndexRangeOfArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 6, 1, 8, 5, 3};
        int startIndex = 2; // Starting index (inclusive)
        int endIndex = 6;   // Ending index (exclusive)

        System.out.println("Original array: " + Arrays.toString(arr));

        // Sort the subarray from startIndex to endIndex
        Arrays.sort(arr, startIndex, endIndex);

        System.out.println("Modified array after sorting range [" + startIndex + ", " + endIndex + "): " + Arrays.toString(arr));
    }
}
