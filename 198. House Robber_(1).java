import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        int [] arr = {1,100,1,1,1,100,1,1,100,1};
        Solution s = new Solution();
        System.out.println("Output: " +s.rob(arr)); 

    }
}
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prevone = nums[0];
        int prevtwo = 0, max = nums[0]; //max = nums[0] for if only one value in input
        
        for (int i=1; i<nums.length; i++) {
            max = Math.max( prevone, prevtwo + nums [i]);
            prevtwo = prevone;
            prevone = max;
        }
        return max;
    }
}