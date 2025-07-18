package Recursion;
import java.util.ArrayList;
public class NumberOfSusbsequenceWithSumK {
    public static int solve(int i, int[] arr, ArrayList<Integer> list, int runningSum, int sum){
        if(runningSum>sum){return 0;}
        if(i>=arr.length){
            if(runningSum==sum){
                System.out.println("Sequence is:"+list.toString());
                return 1;
            }
            return 0;
        }
        //pick
        list.add(arr[i]);
        runningSum+=arr[i];
        int l=solve(i+1,arr,list,runningSum,sum);
        //not pick
        list.remove(list.size()-1);
        runningSum-=arr[i];
        int r=solve(i+1,arr,list,runningSum,sum);
        return l+r;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int sum=6;
        System.out.println("Total:"+solve(0,arr,list,0,6));
    }
}
