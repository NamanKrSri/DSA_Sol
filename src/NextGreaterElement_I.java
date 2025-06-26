import java.util.Stack;
public class NextGreaterElement_I {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] nums={6,0,8,1,3};
        int[] res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        System.out.print("Next Greater Elements: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
