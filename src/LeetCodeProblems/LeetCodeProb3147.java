package LeetCodeProblems;
/*
3147. Taking Maximum Energy From the Mystic Dungeon

In a mystic dungeon, n magicians are standing in a line. Each magician has an attribute that gives you energy. Some magicians
can give you negative energy, which means taking energy from you.You have been cursed in such a way that after absorbing energy from
magician i, you will be instantly transported to magician (i + k). This process will be repeated until you reach the magician where
(i + k) does not exist.In other words, you will choose a starting point and then teleport with k jumps until you reach the end of the
magicians' sequence, absorbing all the energy during the journey.You are given an array energy and an integer k. Return the
maximum possible energy you can gain.Note that when you reach a magician, you must take energy from them, whether it is negative or
positive energy.
 */
public class LeetCodeProb3147 {
        public int maximumEnergy(int[] energy, int k) {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<energy.length;i=i+k){
                max=Math.max(max,recursive(i,k,energy,0));
            }
            return max;
        }
        public int recursive(int i,int k,int[] arr,int energy){
            if(i>(arr.length-1)) return 0;
            energy+=arr[i];
            return recursive(i+k,k,arr,energy);
        }

    public static void main(String[] args) {
            LeetCodeProb3147 prob=new LeetCodeProb3147();
        int[] arr={5,2,-10,-5,1};
        int k=3;
        System.out.println(prob.maximumEnergy(arr,k));
    }
}
