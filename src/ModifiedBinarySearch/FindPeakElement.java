package ModifiedBinarySearch;
//LEETCODE PROBLEM 162
public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int left=0;
        int len=nums.length;
        int right=len-1;
        if(len==1) return 0;
        // if(nums[0]>nums[1]) return 0;
        // if(nums[len-1]>nums[len-2]) return len-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0 && nums[0]>nums[1]) return 0;
            else if(mid==len-1 && nums[mid]>nums[len-2]) return len-1;
            else if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) return mid;
            else if(nums[mid]<nums[mid+1]) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,0,6,4};
        System.out.println(findPeakElement(arr));

    }
}

