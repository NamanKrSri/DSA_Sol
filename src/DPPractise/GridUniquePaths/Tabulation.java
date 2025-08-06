package DPPractise.GridUniquePaths;

import java.util.Scanner;

public class Tabulation {
    static int function(int m,int n){
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else {
                    int left=0,up=0;
                    if(i>0){//means u have prev row
                        up=dp[i-1][j];
                    }
                    if(j>0){//means u have left
                        left=dp[i][j-1];
                    }
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("row length");
        int m=sn.nextInt();
        System.out.println("Col length");
        int n= sn.nextInt();
        System.out.println(function(m,n));
    }
}
