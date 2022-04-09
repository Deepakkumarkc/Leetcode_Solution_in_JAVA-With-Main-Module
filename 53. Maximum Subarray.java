import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Solution s = new Solution();
        System.out.println("Output: " +s.maxSubArray(arr)); 

    }
}   
class Solution {
  public int maxSubArray(int[] nums) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int num : nums) {
      currSum += num;
      System.out.println("CurrSum: " +currSum);
      if (num > currSum) {
        currSum = num;
      }
      maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
  }
}   