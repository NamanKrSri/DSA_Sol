package DPPractise.GridUniquePaths;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceOptimized {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("row length");
        int m=sn.nextInt();
        System.out.println("Col length");
        int n= sn.nextInt();
        int[] prevRow=new int[n];
        int[] currRow=new int[n];
        Arrays.fill(prevRow,1);
        for(int i=0;i<m;i++){
            Arrays.fill(currRow,0);
            for(int j=0;j<n;j++){
                if(i==0 && j==0){currRow[0]=1;}
                else {int left=0,up=0;
                    if(j>0) {
                        left = currRow[j - 1];
                    }
                    if(i>0){
                        up=prevRow[j];
                    }
                    currRow[j]=left+up;
                }
            }
            for(int k=0;k<prevRow.length;k++){
                prevRow[k]=currRow[k];
            }
            }
        System.out.println(currRow[n-1]);
        }
    }
