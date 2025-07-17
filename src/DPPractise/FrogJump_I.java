package DPPractise;

import java.util.Arrays;

public class FrogJump_I {
    //recursive way
    public static int minEnergyRec( int N,int[] Energy){
        if(N==0){
            return 0;//u was standing there so this won't cost any energy, jumping costs energy.
        }
        int j1=minEnergyRec(N-1,Energy)+Math.abs(Energy[N]-Energy[N-1]);
        int j2=Integer.MAX_VALUE;
        if(N>1){
            j2=minEnergyRec(N-2,Energy)+Math.abs(Energy[N]-Energy[N-2]);
        }
        return Math.min(j1,j2);
    }
    public static int minEnergyTabulation(){//bottoms-up approach

        return 0;
    }
    public static void main(String[] args) {
        int[] Energy={10,20,30,10};
        System.out.println("Recursive way :"+ minEnergyRec(Energy.length-1,Energy));
        String s="hello world this is naman";
        System.out.println(s);
    }
}
