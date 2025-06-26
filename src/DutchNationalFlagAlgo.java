import java.util.Arrays;

class DutchNationalFlagAlgo{
    public void sortColors(int[] nums) {
        int low,mid,high;
        int len=nums.length;
        low=0;mid=0;high=len-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2};
        DutchNationalFlagAlgo dn=new DutchNationalFlagAlgo();
        dn.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}