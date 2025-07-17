package Recursion;

import java.util.ArrayList;

public class AllSubsequenceWithSumK {
    public static void solve(int i, int[] arr, ArrayList<Integer> list,int runningSum , int sum){
        if(i>=arr.length){
            if(runningSum==sum){
                System.out.println(list.toString());
            }
            return;
        }
        //pick
        list.add(arr[i]);
        runningSum+=arr[i];
        solve(i+1,arr,list,runningSum,sum);
        //not pick
        list.remove(list.size()-1);
        runningSum-=arr[i];
        solve(i+1,arr,list,runningSum,sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4};
        int sum=6;
        solve(0,arr,list,0,6);
    }
}
