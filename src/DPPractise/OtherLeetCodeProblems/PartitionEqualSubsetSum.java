package DPPractise.OtherLeetCodeProblems;
import java.util.*;
public class PartitionEqualSubsetSum {
        public static boolean canPartition(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            List<Integer> list=new ArrayList<>();
            recursion(nums.length-1,nums,list,map,-1);
            return false;
        }
        static void recursion(int index,int[] nums,List<Integer> list,HashMap<Integer,Integer> map,int sum){
            if(index<0){
                return;
            }
            //pick
            list.add(nums[index]);
            int tsum=0;
            for(int i=0;i<list.size();i++){
                tsum+=list.get(i);
            }
            sum=tsum;
            map.put(sum,map.getOrDefault(sum,1)+1);
            recursion(index-1,nums,list,map,sum);
            //not pick
            sum-=list.get(list.size()-1);
            list.remove(list.size()-1);
            map.put(sum,map.getOrDefault(sum,1)+1);
            recursion(index-1,nums,list,map,sum);
        }

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        System.out.println(canPartition(arr));
    }
}
