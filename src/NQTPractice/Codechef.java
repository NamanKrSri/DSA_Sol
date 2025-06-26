package NQTPractice;

import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        int t=sn.nextInt();
        for(int k=1;k<=t;k++){
            int[] arr=new int[2];
            arr[0]=sn.nextInt();
            arr[1]=sn.nextInt();
            int x=arr[0];
            int y=arr[1];
            long num=0;
            int i=1;
            while(i<=x/2){
                num=num*10+1;
                i++;
            }int j=1;
            while(j<=y){
                num=num*10+2;
                j++;
            }
            while(i<=x){
                num=num*10+1;
                i++;
            }
            System.out.println(num);
        }

    }
}
