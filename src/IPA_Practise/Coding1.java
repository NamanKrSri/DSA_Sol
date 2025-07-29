package IPA_Practise;

import java.util.Scanner;

public class Coding1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String num=sn.nextLine();
        int n=Integer.parseInt(num);int count=0;
        while(n>0){
            int r=n%10;
            if(r%2!=0){
                count+=1;
            }
            n=n/10;
        }
        if(count>=3){
            System.out.println("TRUE");
        }else{
            System.out.println("False");
        }

    }
}
