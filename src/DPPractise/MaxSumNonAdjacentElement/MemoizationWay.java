package DPPractise.MaxSumNonAdjacentElement;

import java.util.ArrayList;
import java.util.Arrays;

public class MemoizationWay {
    public static int maxSum(int index,int[] arr,int[] dp, ArrayList<Integer> list){
        if(index==0){return arr[index];}
        if(index<0){return 0;}
        if(dp[index]!=-1){return dp[index];};
        //pick
        list.add(index);
        int pick=arr[index]+maxSum(index-2,arr,dp,list);
        //not pick
        list.remove(list.size()-1);
        int notpick=0+maxSum(index-1,arr,dp,list);
        dp[index]=Math.max(pick,notpick);
        return dp[index];
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,9};
//        int[] arr2={-4,-2,-7,-1};
        ArrayList<Integer> list=new ArrayList<>();
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println("maxSum of non adjacent element :"+maxSum(arr.length-1,arr,dp,list));
    }

    /*
    * TC=O(n)
    * SC=O(n)+O(n)
    * */
}
