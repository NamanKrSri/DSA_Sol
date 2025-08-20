package DPPractise.GridUniquePathII;

import java.util.Arrays;

/*
Given a 'N' * 'M' maze with obstacles, count and return the number
of paths to reach the right-bottom cell from the top-left cell. A cell
in the given maze has a value -1 if it is a blockage or dead-end, else
0. From a given cell, we are allowed to move to cells (i+1, j) and (i.
j+1) only. Since the answer can be large, print it modulo 10^9 + 7.
 */
public class Tabulation {
    public static int function(int[][] grid){
        int er=grid.length;
        int ec=grid[0].length;
        int[][] dp=new int[er][ec];
        for(int[] row:dp){
            Arrays.fill(row,-1);}
        dp[0][0]=1;
        for(int i=0;i<er;i++){
            for(int j=0;j<ec;j++){
                if(grid[i][j]==-1){dp[i][j]=0;}
                else if(i==0 && j==0){dp[i][j]=1;}
                else{
                    int down=0,left=0;
                    if(j>0){
                        left=dp[i][j-1];
                    }
                    if(i>0){
                        down=dp[i-1][j];
                    }
                    dp[i][j]=down+left;
                }
            }
        }
        return dp[er-1][ec-1];
    }
    public static void main(String[] args) {
//        int[][] grid={{0,0,0},{0,-1,0},{0,0,0
//        },{0,0,0},{0,0,0},{0,0,0},{0,0,0},};
        int[][] grid = {
                {0,0,0,0,-1,0,0,0,0,0},
                {0,-1,0,0,0,0,-1,0,-1,0},
                {0,0,0,-1,0,0,0,0,0,0},
                {-1,0,-1,0,0,-1,0,-1,0,0},
                {0,0,0,0,0,0,0,-1,0,0},
                {0,-1,-1,0,-1,0,0,0,-1,0},
                {0,0,0,0,0,0,0,-1,0,0},
                {0,-1,0,-1,0,0,-1,0,0,0},
                {0,0,0,0,0,-1,0,0,0,-1},
                {0,0,0,-1,0,0,0,0,0,0}
        };
        System.out.println(function(grid));
    }
}
