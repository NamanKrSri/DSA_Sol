package DPPractise;
//similar to maxSumNonAdjacentElement
//HOUSE ROBBER 2 @LEETCODE
public class HouseRobber {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println("Max money after house robbing :"+ArrayFilling(arr));
    }
    static int ArrayFilling(int[] arr){
        int[] arr1=new int[arr.length-1];
        int[] arr2=new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(i!=0 && i!=arr.length-1){
                arr1[i]=arr[i];
                arr2[i-1]=arr[i];
            }
            else if(i==0){
                arr1[i]=arr[i];
            }else if(i==arr.length-1){
                arr2[i-1]=arr[i];
            }
        }
        int MaxSum=Math.max(maxSumNonAdjacentElement(arr1),maxSumNonAdjacentElement(arr2));
        return MaxSum;
    }
    static int maxSumNonAdjacentElement(int[] arr){
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1){pick+=prev2;}
            int notPick=0+ prev2;//maxSum so far
            int curr=Math.max(pick,notPick);prev2=prev;
            prev=curr;

        }
        return prev;
    }
}
