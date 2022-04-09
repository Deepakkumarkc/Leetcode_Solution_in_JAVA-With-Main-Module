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
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }
   private int rob(int[] nums, int start, int end) {
        int prevTwo = 0, prevOne = 0, max = 0;
        for(int i = start; i < end; i++) {
             max = Math.max(prevOne, prevTwo + nums [i]);
             prevTwo = prevOne;
             prevOne = max;
        }
        return max;
    }
                                    
}