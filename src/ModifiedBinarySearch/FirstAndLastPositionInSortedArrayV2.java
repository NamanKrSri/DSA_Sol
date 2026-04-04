package ModifiedBinarySearch;

public class FirstAndLastPositionInSortedArrayV2 {
    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int[] ans=new int[2];
        ans[0]=leftSearch(nums,target);
        ans[1]=rightSearch(nums,target);
        return ans;
    }
    public static int leftSearch(int[] arr,int target){
        int left=0,right=arr.length-1;
        int ans=-1;
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
    public static int rightSearch(int[] arr,int target){
        int left=0,right=arr.length-1;
        int ans=-1;
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
        int[] arr={1,1,2,2,6,6,7,7,8,8,9,9,11,11};
//        System.out.println(searchRange(arr,8));
        int[] sol=searchRange(arr,8);
        System.out.println(sol[0]+" " +sol[1]);
    }
}
