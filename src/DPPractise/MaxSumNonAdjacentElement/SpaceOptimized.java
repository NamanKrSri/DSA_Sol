package DPPractise.MaxSumNonAdjacentElement;
//********THIS CODE WILL FAIL WHEN ARRAY HAVE NEGATIVE VALUES****************************
public class SpaceOptimized {
    public static void main(String[] args) {
    int[] arr={1, 2, 3, 1};
//    int[] arr={-5,-1};
//    int[] arr={-3,-2,9};
//        int[] arr={-4, -2, -7, -1};
//        int[] arr={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,3,99};
        int val=maxSumNonAdjacentElement(arr);
//        long val=findMaxNonAdjSum(arr);
        System.out.println("max sum :"+val);
    }
    public static int maxSumNonAdjacentElement(int[] arr){
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
            int take=arr[i];
            if(i>1){
                take=take+prev2;//since unless u are at index>1 u didn't came after jumping from adjacent
            }
            //if not picking
            int notTake=0+prev;//max sum so far
            int curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
//        return prev;
        return prev;
    }
}
