package NQTPractice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{88,99,20,10,5,0,387,11,7332,1,0};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}
