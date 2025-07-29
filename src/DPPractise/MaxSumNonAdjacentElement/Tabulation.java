package DPPractise.MaxSumNonAdjacentElement;

import java.util.ArrayList;
import java.util.Arrays;

public class Tabulation {
    public static int maxSum(int[] arr, int[] dp){
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notpick=0+dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr={1,7,1,4,9,38};
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println("maxSum of non adjacent element :"+maxSum(arr,dp));
    }
}
