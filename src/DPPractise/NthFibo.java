package DPPractise;

import java.util.Arrays;
import java.util.Scanner;

public class NthFibo {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sn.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
//        System.out.println(fibo(n,dp));
    //tabulation
//        System.out.println(tabulation(n,dp));
    //space
        System.out.println(n);
    }

    //Memoization(Top-down)
    private static int fibo(int n, int[] dp) {
        if(n<=1){
            return n;
        }if(dp[n]!=-1){
            //return n; it should be dp[n]
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    //Tabulation(Bottom-up)
    //since going from bottom no need to store memory
    // it will just reduce recursion stack space
    private static int tabulation(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];//above loop will assign dp[n]
    }

    //space optimized
    private static int spaceOptimizedDp(int n){
        int prev=1;
        int prev2=0;
        int curr=0;
        if(n<=1){
            return n;
        }
        for(int i=2;i<=n;i++){
            curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
}
