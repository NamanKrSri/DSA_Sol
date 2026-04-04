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
        //allSubstring(s,0,1);
       // System.out.println(list.size());
        //LoopMethod(s);
        recrusiveRevision(s,0,1);
    }
    public static void LoopMethod(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                System.out.println(count++ +" "+str.substring(i,j));
            }
        }
    }
    static void recrusiveRevision(String s,int start, int end){
        if(start==s.length()) return;
        if(end==s.length()){
            System.out.println(s.substring(start,end));
            end=start+2;
            recrusiveRevision(s,start+1,end);
            return;
        }
        System.out.println(s.substring(start,end));
        recrusiveRevision(s,start,end+1);
    }
}
