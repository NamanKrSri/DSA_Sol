package ModifiedBinarySearch;

public class FirstAndLastPositionInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int[] ans={-1,-1};
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans[0]=leftSearch(nums,target,mid);
                ans[1]=rightSearch(nums,target,mid);
                break;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static int leftSearch(int[] arr,int target,int mid){
        int left=0,right=mid;
        int ans=mid;
        while(left<=right){
            int mid2=left+ (right-left)/2;
            if(arr[mid2]==target){
                ans=mid2;
                right=mid2-1;
            }
            else if(arr[mid2]<target) {left=mid2+1;}
            else{
                right=mid2-1;}
        }
        return ans;
    }
    public static int rightSearch(int[] arr,int target,int mid){
        int left=mid+1,right=arr.length-1;
        int ans=mid;
        while(left<=right){
            int mid2=left+ (right-left)/2;
            if(arr[mid2]==target){
                ans=mid2;
                left=mid2+1;
            }
            else if(arr[mid2]<target) {left=mid2+1;}
            else{right=mid2-1;}
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={-2,-2,-2,1,1,2,2,6,6,7,7,8,9,9,11,11};
//        System.out.println(searchRange(arr,8));
    int[] sol=searchRange(arr,8);
        System.out.println(sol[0]+" " +sol[1]);
    }
    //here it is failing when input target is appearing for 1 time only

}
