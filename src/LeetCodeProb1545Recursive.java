public class LeetCodeProb1545Recursive {
    public static char findKthBit(int n, int k) {
        int len=1<<n;// it is equal to 2^n;
        if(n==1) return '0';
        //mid is at 2^n-1;
        if(k<len/2){
           char ch=findKthBit(n-1,k);
           return ch;
        }
        else if(k==len) return '1';
        else{
            //it means find char at len-k index of
            char ch=findKthBit(n,len-k);
            return ch=='1'?'0':'1';
        }
    }

    public static void main(String[] args) {
        int n=20;
        int k=1048575;
        System.out.println(findKthBit(n,k));
    }
}
