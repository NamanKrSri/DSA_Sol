package NQTPractice;

import java.util.Scanner;

//TC=O(sqrt(N))
public class Prime {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<2) return false;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i<=(int)Math.sqrt(n);i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
