package NQTPractice;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{77,1,0,36,12,99,267,2,59};
        mergeSort(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
    public static void mergeSort(int[] arr){
        int len=arr.length;
        int startIndex=0;
        int endIndex=len-1;
        divide(arr,startIndex,endIndex);
    }
    public static void divide(int[] arr, int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int mid=startIndex+(endIndex-startIndex)/2;
        divide(arr,startIndex,mid);
        divide(arr,mid+1,endIndex);
        conquer(arr,startIndex,mid,endIndex);
    }
    public static  void conquer(int[] arr, int startIndex, int mid, int endIndex){
        int p1=startIndex;
        int p2=mid+1;
        int x=0;
        int[] merged=new int[endIndex-startIndex+1];
        while(p1<=mid && p2<=endIndex){
            if(arr[p2]<=arr[p1]){
                merged[x++]=arr[p2++];
            }else {
                merged[x++]=arr[p1++];
            }
        }
        while(p1<=mid){
            merged[x++]=arr[p1++];
        }
        while(p2<=endIndex){
            merged[x++]=arr[p2++];
        }
        for(int i=0,j=startIndex; i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
}
