package DPPractise.TrainingNinja;

/*
Ninja is planing this 'N' days-long training schedule. Each day, he can perform any one of these
three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit
points on each day? As Ninja has to improve all his skills, he can't do the same activity in two
consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?
You are given a 2D array of size N*3 'POINTS' with the points corresponding to each day and
activity. Your task is to calculate the maximum number of merit points that Ninja can earn.
 */
public class Tabulation {
    static int function2(int[][] points){//based on my approach
        int n=points.length;
        int[][] dp=new int[n][3];
        //for day 0 u r free to do any task
      for(int task=0;task<3;task++){
          dp[0][task]=points[0][task];
      }
      for(int i=1;i<n;i++){
          //check the last task done on prv day
          for(int last=0;last<3;last++){//since u want to calc max so u will pretend it ki kuch bhi ho skta last task
              //now do the current task by avoiding the last task
              for(int task=0;task<3;task++){
                  if(task!=last){
                      int point=points[i][task] + dp[i-1][last];
                      dp[i][task]=Math.max(dp[i][task],point);
                  }
              }
          }
      }
      return Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
    }
    static int function(int[][] arr){//based on gfg approach
        int n=arr.length;
        int[][] dp=new int[n+1][3];
        for(int i=n-1;i>=0;i--){
            for(int last=0;last<3;last++){
                for(int task=0;task<3;task++){
                    if(task!=last){
                       int points=arr[i][task]+dp[i+1][last];//cal points of current task and the one obtained from doing last task on prv day
                       dp[i][task]=Math.max(points,dp[i][task]);
                    }
                }
            }
        }
        return Math.max(Math.max(dp[0][0], dp[0][1]),
                dp[0][2]);
    }

    public static void main(String[] args) {
        int[][] mat
                = { { 1, 2, 5 }, { 3, 1, 1 }, { 3, 3, 3 } };
        System.out.println("Function 1:"+function(mat));
        System.out.println("Function 2:"+function2(mat));
    }
}
