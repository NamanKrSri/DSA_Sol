package Recursion;

class AllSubsequenceString {
   static int count=1;
    static void solve(int i, String s, String f) {
        if (i == s.length()) {
            System.out.println(count++ +" "+f);
            return;
        }
        //picking9
        //f = f + s.charAt(i);
        solve(i + 1, s,  f+s.charAt(i));
        //poping out while backtracking
        //f.pop_back();
        solve(i + 1, s,  f);
    }
    public static void main(String args[]) {
        String s = "a*c";

        String f = "";
        System.out.println("All possible subsequences are: ");
        solve(0, s, f);
    }
}