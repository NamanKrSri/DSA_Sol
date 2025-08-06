package DPPractise.GridUniquePaths;

import java.util.Arrays;

public class Memoization {
    static int function(int i, int j,int er,int ec,int[][] dp){
        if(i==er && j==ec){return 1;}
        if(i<0 || j<0 || i>er || j>ec){return 0;}
        if(dp[i][j]!=-1){return dp[i][j];}
        int right=function(i,j+1,er,ec,dp);
        int down=function(i+1,j,er,ec,dp);
        dp[i][j]=right+down;
        return dp[i][j];
    }

    public static void main(String[] args) {
        int er=2;
        int ec=6;
        int[][] dp=new int[er+1][ec+1];
       for(int[] row:dp){
           Arrays.fill(row,-1);
       }
        System.out.println(function(0,0,er,ec,dp));
    }
}
