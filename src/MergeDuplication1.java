public class MergeDuplication1 {
    // class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         ArrayList<Integer> list=new ArrayList<>();
//         map.put(nums[0],0);
//         list.add(nums[0]);
//         for(int i=0;i<nums.length;i++){
//             int e=nums[i];
//            if(!map.isEmpty() && map.containsKey(e)==false){
//             map.put(e,i);
//             list.add(e);
//            }
//         }
//         for(int i=0;i<list.size();i++){
//             nums[i]=list.get(i);
//         }
//         return map.size();
//     }
// }
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }

    //         Set<Integer> set = new HashSet<>();
//         int i = 0;
//         for (int num : nums) {
//             if (set.add(num)) { // add() returns true if the element was added successfully (i.e., it's not a duplicate)
//                 nums[i++] = num;
//             }
//         }
//         return i;
//     }
// }
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int idx1=0,idx2=1;
            while(idx2<nums.length){
                if(nums[idx1]!=nums[idx2]){
                    idx1++;
                    idx2++;
                }
                else if(nums[idx2]==nums[idx1]){
                    idx2++;
                }
                else if(nums[idx2]!=nums[idx1]&&nums[idx1+1]==nums[idx1]){
                    nums[idx1+1]=nums[idx2];
                    idx1+=1;
                    idx2+=1;
                }
            }
            return idx1+1;
        }

    public static void main(String[] args) {
//        int[] num1={0,0,1,1,1,2,2,3,3,3,4};
        int[] num1={1,1,2};
        System.out.println(removeDuplicates(num1));
    }
}
