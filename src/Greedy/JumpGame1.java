package Greedy;
/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame1 {
    public static boolean canReach(int[] arr) {
        int maxIndex=0;
//        for(int i=0;i<arr.length;i++){
//            int val=arr[i];
//            maxIndex+=val;
//            if(i>maxIndex){return false;}
//        }
//        return true;

        //correct code
        for(int i=0;i<arr.length;i++){
            if(i>maxIndex){return false;}
            maxIndex=Math.max(maxIndex,i+arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
       int[] arr={0,2,1,2,7};
        System.out.println(canReach(arr));
    }
}
