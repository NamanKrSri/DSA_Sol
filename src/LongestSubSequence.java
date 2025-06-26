import java.util.*;
public class LongestSubSequence {
    public static int lengthOfLongestSubstring(String s) {
        int l=0,r;int maxLen=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.isEmpty()){
                map.put(ch,r);
                maxLen=Math.max(maxLen,r-l+1);
                continue;
            }
            if(map.containsKey(ch)==false){
                map.put(ch,r);
                maxLen=Math.max(maxLen,r-l+1);
                continue;
            }
            if(map.containsKey(ch)==true && map.get(ch)>=l){
                l=map.get(ch)+1;
                map.put(ch,r);

                continue;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
