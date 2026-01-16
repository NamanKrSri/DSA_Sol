package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given two arrays, val[] and wt[] , representing the values and weights of items, and an integer capacity representing the maximum weight a
knapsack can hold, determine the maximum total value that can be achieved by putting items in the knapsack.
You are allowed to break items into fractions if necessary.
Return the maximum value as a double, rounded to 6 decimal places.

Examples :

Input: val[] = [60, 100, 120], wt[] = [10, 20, 30], capacity = 50
Output: 240.000000
Explanation: By taking items of weight 10 and 20 kg and 2/3 fraction of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240
Input: val[] = [500], wt[] = [30], capacity = 10
Output: 166.670000
Explanation: Since the item’s weight exceeds capacity, we take a fraction 10/30 of it, yielding value 166.670000.
Constraints:
1 ≤ val.size = wt.size ≤ 10^5
1 ≤ capacity ≤ 10^9
1 ≤ val[i], wt[i] ≤ 10^4
 */
public class FractionalKnapSack {
    class Solution {
        public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
            // code here
            double sol=0;
            List<KnapSack> list=new ArrayList<>();
            for(int i=0;i<val.length;i++){
                list.add(new KnapSack(val[i],wt[i],(double)val[i]/wt[i]));//imp step
            }
            Collections.sort(list,(a, b)->Double.compare(b.density,a.density));
            for(int i=0;i<list.size() && capacity!=0;i++){
                KnapSack k=list.get(i);
                if(capacity>0 && k.wt<=capacity){
                    capacity-=k.wt;
                    sol+=k.val;
                }//337
                else if(capacity>0 && k.wt>capacity){
                    sol+=(k.density*capacity);
                    capacity=0;
                }
            }
            return sol;
        }
        class KnapSack{
            int val;
            int wt;
            double density;
            KnapSack(int v,int w,double d){this.val=v;this.wt=w;this.density=d;}
        }
    }

    public static void main(String[] args) {

    }
}
