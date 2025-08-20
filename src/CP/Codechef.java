package CP;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sn=new Scanner(System.in);
        int tc=sn.nextInt();
        for(int i=0;i<tc;i++){
            int[] arr=new int[4];
            for(int j=0;j<4;j++){arr[j]=sn.nextInt();
            }
            System.out.println(fxn(arr));
        }
    }
    static String fxn(int[] arr){
        int g1=arr[0];
        int s1=arr[1];
        int g2=arr[2];
        int s2=arr[3];
        s1=s1+g1*5;
        s2=s2+g2*5;
        if(s1==s2){return "Yes";}
          else if(s2>s1){return "No";}
        else if(Math.abs(s1-s2)%6==0){return "Yes";}
        return "No";
    }
}
