package ModifiedBinarySearch;
//LEETCODE PROBLEM 153
public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
    public static int findMinMyVersion(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        if(len==1) return nums[left];
        if(len==2) return nums[left]<nums[right]?nums[left]:nums[right];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid<len-1 && nums[mid]>nums[mid+1]){return nums[mid+1];}
            //basically ideal sorted array for BS = low<mid<high but here either mid < low or mid > high psbl
            else if(nums[left]<nums[mid] && nums[mid]<nums[right]){
                return nums[left];
            }
            else if(nums[left]<=nums[mid]){//means left is sorted go to unsorted thing
                left=mid+1;
            }else if(nums[right]>nums[mid]){//means right half sorted
                right=mid;
            }
        }
        return -1;
    }
//my version is also passing all TC
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(findMinMyVersion(arr));
        System.out.println(findMin(arr));

    }
}
