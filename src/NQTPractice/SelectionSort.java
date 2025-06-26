package NQTPractice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{88,99,20,10,5,0,387,11,7332,1,0};
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++) {
              if(min>arr[j]){
                  min=arr[j];
                  index=j;
              }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[index]=temp;
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}
