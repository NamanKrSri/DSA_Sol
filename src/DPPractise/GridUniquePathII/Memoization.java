package DPPractise.GridUniquePathII;

import java.util.Arrays;

/*
Given a 'N' * 'M' maze with obstacles, count and return the number
of paths to reach the right-bottom cell from the top-left cell. A cell
in the given maze has a value -1 if it is a blockage or dead-end, else
0. From a given cell, we are allowed to move to cells (i+1, j) and (i.
j+1) only. Since the answer can be large, print it modulo 10^9 + 7.
 */
//LeetCode link- https://leetcode.com/problems/unique-paths-ii/description/
public class Memoization {
    public static int mod=(int)1e9+7;
    public static int fxn(int i, int j,int[][] grid,int[][] dp){
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==-1){return 0;}
        if(i==0 && j==0){return 1;}
        if(i<0 || j<0){return 0;}
        if(dp[i][j]!=-1){return dp[i][j];}
        int up=fxn(i-1,j,grid,dp);
        int left=fxn(i,j-1,grid,dp);
        dp[i][j]=up+left;
        return dp[i][j]%mod;
    }
    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,-1,0},{0,0,0
        },{0,0,0},{0,0,0}};
        int er=grid.length;

        int ec=grid[0].length;

        int[][] dp=new int[er+1][ec+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(fxn(er-1,ec-1,grid,dp));
    }
}
