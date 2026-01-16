package Recursion;

import java.util.ArrayList;

public class AllSubstring {
    static ArrayList<String> list=new ArrayList<>();
    static void allSubstring(String s,int start,int end){
        if(start==s.length()){
            return;
        }
        if(end==s.length()){
            System.out.println(s.substring(start,end));
            list.add(s.substring(start,end));
            allSubstring(s,start+1,start+2);
            return;
        }
        System.out.println(s.substring(start,end));
        list.add(s.substring(start,end));
        allSubstring(s,start,end+1);
    }

    public static void main(String[] args) {
        String s="ABCDEF";
        allSubstring(s,0,1);
        System.out.println(list.size());
    }
}
