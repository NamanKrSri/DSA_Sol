import java.util.Arrays;

class NextPermutation {
    public int[] nextPermutation(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int p1=nums.length-1;
        int p2=nums.length-2;
        int pivotNum=-1;
        int pivotInd=-1;
        while(p2>=0){
            if(nums[p2]<nums[p1]){
                pivotNum=nums[p2];
                pivotInd=p2;
                //swap with the digit just greater than nums[p2] towards its right side
                Arrays.sort(nums,p2+1,nums.length);
                int nextgreatdigit=nums[p2+1];
                int swap=nextgreatdigit;
                nums[p2+1]=pivotNum;
                nums[p2]=swap;
            }else{
                p2-=1;
                p1-=1;
            }
        }
        if(pivotInd==-1){
            Arrays.sort(nums);
        }
        return nums;
    }

    public static void main(String[] args) {
        NextPermutation np=new NextPermutation();
        int[] op=np.nextPermutation(new int[]{1,2,3});
        System.out.println(Arrays.toString(op));
    }
}