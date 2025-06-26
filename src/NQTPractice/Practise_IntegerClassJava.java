package NQTPractice;

import java.util.Scanner;

public class Practise_IntegerClassJava {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println("Bit count : "+Integer.bitCount(n));
        String s=Integer.toBinaryString(n);
        System.out.println("Binary : "+Integer.toBinaryString(n));
        System.out.println("Hex : "+Integer.toHexString(n));
        System.out.println("Octal : "+Integer.toOctalString(n));
        System.out.println();
        System.out.println("String to Int : "+Integer.parseInt(s));
        System.out.println("Binary to Int : "+Integer.parseInt(s,2));//correct
//        System.out.println("Binary to octal : "+Integer.parseInt(s,8));//wrong
////        System.out.println("Binary to hex : "+Integer.parseInt(s,16));//wrong
//        System.out.println("Hex to dec : "+Integer.parseInt(Integer.toHexString(n),2));//wrong
//        System.out.println("Hex to octa; : "+Integer.parseInt(Integer.toHexString(n),8));//wrong
        System.out.println("reverseBit : "+Integer.reverse(n));

        //changing case
//        String sentence=sn.nextLine();
//        StringBuilder str=new StringBuilder(sentence);
//        for(int i=0;i<str.length();i++){
//            char ch= str.charAt(i);
//            if(ch>='A' && ch<='Z'){
//                str.setCharAt(i,Character.toLowerCase(ch));
//            }
//            else if(ch>='a' && ch<='z'){
//                str.setCharAt(i,Character.toUpperCase(ch));
//            }
//        }
//        System.out.println("New : "+str.toString());
    }
}
