package DPPractise.GridUniquePathII;

/*
Given a 'N' * 'M' maze with obstacles, count and return the number
of paths to reach the right-bottom cell from the top-left cell. A cell
in the given maze has a value -1 if it is a blockage or dead-end, else
0. From a given cell, we are allowed to move to cells (i+1, j) and (i.
j+1) only. Since the answer can be large, print it modulo 10^9 + 7.
 */

public class Recursive {
    static int function(int i,int j , int[][] grid){
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==-1){return 0;}
        if(i==0&&j==0){return 1;}
        if(i<0 || j<0){return 0;}
        int up=function(i-1,j,grid);
        int left=function(i,j-1,grid);
        return up+left;
    }
    public static void main(String[] args){
        int[][] grid={{1,3,1},{1,5,1},{4,2,1
        }};
        System.out.println(function(grid.length-1,grid[0].length-1,grid));
    }
}

