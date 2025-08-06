package DPPractise.GridUniquePaths;

public class Recursive {
    static int function(int i, int j,int er,int ec){
        if(i==er && j==ec){return 1;}
        if(i<0 || j<0 || i>er || j>ec){return 0;}
        int right=function(i,j+1,er,ec);
        int down=function(i+1,j,er,ec);
        return right+down;
    }

    public static void main(String[] args) {
        //3X7 matrix
        System.out.println(function(0,0,2,6));
    }
}
