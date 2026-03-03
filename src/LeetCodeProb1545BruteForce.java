public class LeetCodeProb1545BruteForce {
    public static char findKthBit(int n, int k) {
        int n2=n;
        String s1="0";
        String arr[]=new String[n+1];
        arr[0]=s1;
        arr[1]=s1;
        if(n==1) return '0';
        for(int i=2;i<=n;i++){
            String invert=inverse(arr[i-1]);
            String reversed=reversed(invert);
            String prevString=arr[i-1]+"1"+reversed;
            arr[i]=prevString;
        }
        char ans=arr[n2].charAt(k-1);
        return ans;
    }
    public static String inverse(String s){
        // String s2="";
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){s2.append('0');}
            else{s2.append('1');}
        }
        return s2.toString();
    }
    public static String reversed(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        int n=20;
        int k=1048575;
        System.out.println(findKthBit(n,k));
    }
}
