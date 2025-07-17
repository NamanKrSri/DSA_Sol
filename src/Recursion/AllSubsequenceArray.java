package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsequenceArray {
    public static void solve(int index, int[] array, ArrayList<Integer> list){
        if(index== array.length){
            System.out.println(list.toString());
            return;
        }
        list.add(array[index]);//picking up the index
        solve(index+1,array,list);
        //dropping the index
        list.remove(list.size()-1);
        solve(index+1,array,list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4};
        solve(0,arr,list);
    }
}

