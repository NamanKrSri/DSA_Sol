package DPPractise.TrainingNinja;

import java.util.Arrays;

public class MemoizationWay {
    static int[][] points
            = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } };
    static int n = points.length;
    static int[][] dp = new int[n][4];//u will write the last task to be 3 so that all the task can be computed so for that case u have to make dp size here to be 4

    static int function(int day, int last,int[][] points, int[][] dp){
        if(day==0){
            int max=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    int point=points[day][task];
                    max=Math.max(max,point);
                }
            }
            return max;
        }
        if (dp[day][last] != -1) return dp[day][last];
        //any other day
        int max=0;//obtain the max points
        for(int task=0;task<3;task++){
            if(task!=last){
                int point=points[day][task]+function(day-1,task,points,dp);
                max=Math.max(point,max);
            }
        }
        return dp[day][last]=max;
    }

//    public static void main(String[] args) {
//        int[][] points
//                = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } };
//        int n = points.length;
//        int[][] dp = new int[n][4];//u will write the last task to be 3 so that all the task can be computed so for that case u have to make dp size here to be 4
//        for (int[] row : dp)
//            Arrays.fill(row, -1);
//      int val= function(n-1,3,points,dp);
//        System.out.println(val);
//    }
    public static void main(String[] args) {
        for(int[] row : dp)
            Arrays.fill(row, -1);
        int val= function(n-1,3,points,dp);
        System.out.println("val"+val);
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
