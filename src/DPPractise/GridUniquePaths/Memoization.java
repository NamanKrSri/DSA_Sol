package DPPractise.GridUniquePaths;

import java.util.Arrays;
/*
You are present at point 'A' which is the top-left cell of an M X N matrix, your destination is point
'B', which is the bottom-right cell of the same matrix. Your task is to find the total number of
unique paths from point 'A' to point 'B'.In other words, you will be given the dimensions of the
matrix as integer] "M' and 'N'. your task is to find the total number of unique paths from the cell
MATRIX[O][0] to MATRIX['M' - 1)["N' - 1).
To traverse in the matrix, you can either move Right or Down at each step. For example in a given
point MATRIX[i][j], you can move to either MATRIX[i + 1][j] or MATRIX[i][j + 1].
 */
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
