import java.util.*;
class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int count = 0;
        list.get(0).add(intervals[0][0]);
        list.get(0).add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][0] && intervals[i][0] <= intervals[i - 1][1]) {//checking the lowerlimit is inside the prv row lowerlimit
                if (intervals[i][1] > intervals[i - 1][1]) {//checking the upperlimit of current row is outside the upperlimit of prv row or not
                    list.get(list.size() - 1).set(1, intervals[i][1]);
                    continue;
                }
                //if the curr row upperlimit is completely inside the prv row that we don't need to bother just move forward
                else {
                    continue;
                }
            } else {
                list.add(new ArrayList<>());
                list.get(list.size() - 1).add(intervals[i][0]);
                list.get(list.size() - 1).add(intervals[i][1]);
            }
        }

        int[][] array = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            array[i] = new int[list.get(i).size()];
            for (int j = 0; j < list.get(i).size(); j++) {
                array[i][j] = list.get(i).get(j);
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[][] intervals={{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] arr=merge(intervals);
        System.out.println(Arrays.deepToString(arr));
    }
}