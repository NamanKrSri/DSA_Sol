import java.util.*;
import java.lang.*;
import java.io.*;

class Max
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        int tcase=sn.nextInt();
        for(int i=1;i<=tcase;i++){
            int len=sn.nextInt();
            int[] arr=new int[len];
            int[] dup=new int[len];
            for(int j=0;j<len;j++){arr[j]=sn.nextInt();
                dup[j]=arr[j];
            }
            Arrays.sort(dup);
            int max=dup[len-1];
            System.out.println(Max(arr,dup,len,max));
        }
    }
    public static int Max(int[] arr,int[] dup,int len,int max){
        if(len>=4){
            if(max==arr[0] || max==arr[len-1]){
                return max;
            }
            if(max==arr[1]){
                return max-arr[0];
            }
            if(max==arr[len-2]){
                return max-arr[len-1];
            }
            return max;
        }
        if(len==2){
            return dup[1]-dup[0];
        }
        if(len==1){
            return dup[0];
        }
        //now only size is 3
        if(max==arr[1] && max!=arr[0] && max!=arr[2]){
            return (dup[2]-dup[1])-dup[0];
        }
        return max;
    }
}
