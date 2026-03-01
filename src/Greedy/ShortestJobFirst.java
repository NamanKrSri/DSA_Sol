package Greedy;

import java.util.Arrays;
/*
Geek is a software engineer. He is assigned with the task of calculating average waiting time of all the processes by following shortest job first policy.

The shortest job first (SJF) or shortest job next, is a scheduling policy that selects the waiting process with the smallest execution time to execute next.

Given an array of integers bt of size n. Array bt denotes the burst time of each process. Calculate the average waiting time of all the processes and return the nearest integer which is smaller or equal to the output.

Note: Consider all process are available at time 0.

Example 1:

Input:
n = 5
bt = [4,3,7,1,2]
Output: 4
Explanation: After sorting burst times by shortest job policy, calculated average waiting time is 4.
 */
public class ShortestJobFirst {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wait=0,sum=0;
        for(int i=0;i<bt.length;i++){
            if(i>0) wait+=bt[i-1];
            sum+=wait;
        }
        // System.out.print(wait);
        return sum/bt.length;
    }

    public static void main(String[] args) {

    }
}

