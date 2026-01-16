package Greedy;
/*
leetcode- https://leetcode.com/problems/valid-parenthesis-string/description/
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 */
public class ValidParenthesisString {
    public static boolean checkValidString(String s) {
        int low=0,high=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                low+=1;
                high+=1;
            } else if (ch==')') {
                low-=1;
                high-=1;
            } else if (ch=='*') {
                low-=1;
                high+=1;
            }
            if(low<0) low=0;
            if(high<0) return false;
        }
        return low==0;
    }

    public static void main(String[] args) {
        String s="*(*)(*))((*)*)))(*)())*())()(()*)*)****)())(()()*(*(*())()((())))*()****)(*(()))((*()*(**(*()*)*()";
        System.out.println(checkValidString(s));
    }
}
