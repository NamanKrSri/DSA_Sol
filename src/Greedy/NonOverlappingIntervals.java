package Greedy;

import java.util.ArrayList;
import java.util.Collections;
/*
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3] are non-overlapping.



Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.


Constraints:

1 <= intervals.length <= 10^5
intervals[i].length == 2
-5 * 10^4 <= starti < endi <= 5 * 10^4
 */
public class NonOverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        ArrayList<Meeting> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            list.add(new Meeting(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(list,(a, b)->a.end-b.end);
        int lastMeet=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            Meeting meet=list.get(i);
            if(meet.start>=lastMeet){
                count+=1;
                lastMeet=meet.end;
            }
        }
        return intervals.length-count;
    }
    static class Meeting{
        int start;
        int end;
        Meeting(int s,int e){this.start=s;this.end=e;}
    }

    public static void main(String[] args) {
        int[][] arr={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(arr));
    }
}
