import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sn=new Scanner(System.in);
        String arr=sn.nextLine();
//        System.out.println(arr.toString());
//        arr.trim();
        String[] arr2= arr.split(" ");
//        System.out.println("here is arr2"+arr2.toString());
        //see the amazing thing
//        System.out.println("here is arr2"+Arrays.toString(arr2));
//        System.out.println("test");
        int[] res=new int[arr2.length];
//        int count=0;
        for(int i=0;i<res.length;i++){
            res[i]=Integer.parseInt(arr2[i]);
            map.put(i,res[i]);
            System.out.println("At index:"+i+" "+res[i]);
        }
        Set<Integer> key=map.keySet();
        for(int it:key){
            System.out.println("Keys are:"+ it + "-> "+"values are:" +map.get(it));
//            System.out.println();
        }

//        int[] res=new int[arr.length()/2+1];
//        for(int i=0;i<res.length;i++){
//            res[i]=Integer.parseInt(arr.substring())
//        }
    }
}
