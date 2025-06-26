package NQTPractice;

public class lcmOfArray{
    static long Mod=1000000007;
    static long lcmOfArray(int N, int A[]){
        long lcm=A[0];
        for(int i=1;i<N;i++){
            lcm=LCM(lcm,A[i]);
        }
        return lcm;
    }
    static long LCM(long a, long b){
        long lcm=((a%Mod)*(b/GCD(a,b))%Mod)%Mod;
        return lcm;
    }
    static long GCD(long a,long b){
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }

    public static void main(String[] args) {
        int[] A=new int[]{100000,28596,345689,432359,57890356,1000000,1000000,50000000,9000000,7896320,600000};
        System.out.println(lcmOfArray(A.length,A));
    }
}
