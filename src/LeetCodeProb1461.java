import java.util.HashSet;
import java.util.Set;

/*
1461. Check If a String Contains All Binary Codes of Size K
Que-Given a binary string s and an integer k, return true if every binary code of length k is a substring of s. Otherwise, return false.
 */
public class LeetCodeProb1461 {
    public static boolean hasAllCodes(String s, int k) {
        long totalBinaryCodes=(long)(Math.pow(2,k));
        long minLength=totalBinaryCodes*k;
        Set<Integer> set=new HashSet<>();
        if(s.length()<minLength) return false;
        int window=k;
        for(int i=0;i<=s.length()-k;i=i+1){
            String binary=s.substring(i,i+k);
            int num=Integer.parseInt(binary,2);
            set.add(num);
        }
        return set.size()==(int)(Math.pow(2,k));
    }
    public static void main(String[] args) {
        String s="00110";
        System.out.println(hasAllCodes(s,2));
    }
}
