package NQTPractice;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr=new int[]{88,99,20,10,5,0,387,11,7332,1,0};
        int[] arr=new int[]{88,99,77,66,55,44,33,22,11,10,0};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--) {
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
        String s= "0 12 335 456 789";
        String[] arr2=s.split(" ");
        for(String str:arr2){
            System.out.println("word :" + str);
        }
    }
}
