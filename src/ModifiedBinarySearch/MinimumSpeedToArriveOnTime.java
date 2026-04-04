package ModifiedBinarySearch;
//PROBLEM 1870
public class MinimumSpeedToArriveOnTime {
    public static int minSpeedOnTime(int[] dist, double hour) {
        int max=10000000;
        int sol=0;
        int min=1;
        double minTime=feasibleTime(max,dist);
        if(minTime>hour) return -1;
        while(min<=max){
            int mid=min+(max-min)/2;
            double cTime=feasibleTime(mid,dist);
            if(cTime<=hour){
                sol=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }

        }
        return sol;
    }
    public static double feasibleTime(int speed,int[] dist){
        double time=0;
        for(int i=0;i<dist.length;i++){
            if(i!=dist.length-1){
                time += Math.ceil((double)dist[i] / speed);
            }else{
                time+=(double)(dist[i]) / speed;
            }
        }
        return time;
    }
    public static void main(String[] args) {

    }
}
