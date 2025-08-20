package DPPractise.TrainingNinja;
/*
Ninja is planing this 'N' days-long training schedule. Each day, he can perform any one of these
three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit
points on each day? As Ninja has to improve all his skills, he can't do the same activity in two
consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?
You are given a 2D array of size N*3 'POINTS' with the points corresponding to each day and
activity. Your task is to calculate the maximum number of merit points that Ninja can earn.
 */
public class RecursiveWay {
    static int function(int day,int last,int[][] points){
        if(day==0){
            int max=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    int point=points[day][task];//at day 0 u can do any of the task just avoid the prev day last task
                    max=Math.max(max,point);
                }
            }
            return max;
        }
        //for any day just cal the task
        int max=0;
        for(int task=0;task<3;task++) {
            if (task != last) {
                int point = points[day][task]+function(day-1,task,points);
                max=Math.max(point,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] points = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};
        int n=points.length;
        System.out.println(function(n-1,3,points));//here u should give value greater than 2 becoz if u write any val <3 it will be like u did that task
    }
}
