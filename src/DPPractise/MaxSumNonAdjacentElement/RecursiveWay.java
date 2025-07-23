package DPPractise.MaxSumNonAdjacentElement;

import java.util.ArrayList;

public class RecursiveWay {
    public static int maxSum(int index, int[] arr, ArrayList<Integer> list){
        if(index==0){
            return arr[0];
        } if(index<0){
            return 0;// for fxn(-1)
        }
        //pick
        list.add(arr[index]);
        int pick=arr[index]+maxSum(index-2,arr,list);//if u picked that index then now more to next to next element
        //not pick
        list.remove(list.size()-1);//u opted to next pick that index means now move to next element and choose weather to pick him or not
        int notPick=0+ maxSum(index-1,arr,list);
        return Math.max(pick,notPick);
    }
    public static void main(String[] args) {
        int[] arr={2,1,4,9};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("maxSum of non adjacent element :"+maxSum(arr.length-1,arr,list));
    }
}
