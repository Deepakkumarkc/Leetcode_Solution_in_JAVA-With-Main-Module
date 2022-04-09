import java.util.*;
class Main{
    public static void main(String[] args){
        int [] arr = {3,-1,4};
        Solution s = new Solution();
        System.out.println("Output: " + s.maxProduct(arr));
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        return maxProductHelper(nums);
    }
    
    public int maxProductHelper(int [] nums){
        int max = Integer.MIN_VALUE;
        int temp = 1;
        //Front Check
        for(int num: nums){
            //System.out.println("Num = "+num);
            temp *= num;
            //System.out.println("Temp = "+temp);
            max = Math.max(temp,max);
            //System.out.println("Max1 = "+max);
            if(temp == 0){
                temp = 1;
            }
        }
        // Reverser Check 
        temp = 1;
        for(int start = nums.length-1; start >= 0;start--){
          temp *= nums[start];
          max = Math.max(temp,max);
          //System.out.println("Max2 = "+max);
          if(temp == 0){
              temp = 1;
          }  
        }
        return max;
    }
}