package DPPractise.GridUniquePathII;

public class Recursive {
    static int function(int i,int j , int[][] grid){
        if(i==0&&j==0){return grid[0][0];}
        if(i<0 || j<0){return (int)1e9;}
        int up=grid[i][j]+function(i-1,j,grid);
        int left=grid[i][j]+function(i,j-1,grid);
        return Math.min(up,left);
    }
    public static void main(String[] args){
        int[][] grid={{1,3,1},{1,5,1},{4,2,1
        }};
        System.out.println(function(grid.length-1,grid[0].length-1,grid));
    }
}

