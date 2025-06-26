package NQTPractice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SymmetricPair {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int N=sn.nextInt();
//        sn.nextLine();
        int[][] pairs=new int[N][2];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                pairs[i][j]=sn.nextInt();
//                sn.nextLine();
            }
//            int[] arr=new int[]{pairs[i][0],pairs[i][1]};
//            if(map.isEmpty() || map.containsKey(arr)==false){
//                map.put(new int[]{pairs[i][0],pairs[i][1]},i);
            //this won't work as due to internal structure of map it doesn't recognize elements of array stored as key, its just check the hashcode
            String key=pairs[i][0]+","+pairs[i][1];
            if(map.isEmpty() || map.containsKey(key)==false){
                map.put(key,i);
            }
            }
        System.out.println("Printing");
        Set<String> keys=map.keySet();
        for(String it:keys){
            String[] arr=it.split(",");
            System.out.println(arr[0]+""+arr[1]);
        }
        }
//        System.out.println(map.size());
    }

