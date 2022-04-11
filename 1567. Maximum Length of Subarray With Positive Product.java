import java.util.*;
import java.util.Arrays;  
class Main{
    public static void main(String[] args){
        int [] arr = {2,3,-2,4};
        Solution s = new Solution();
        System.out.println(Arrays.toString(arr));   
        System.out.println("Output1: " + s.getMaxLen(arr));
        System.out.println();
        int [] arr1 = {0,1,-2,-3,-4};
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output2: " + s.getMaxLen(arr1));
        System.out.println();
        int [] arr2 = {-1,-2,-3,0,1};
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output3: " + s.getMaxLen(arr2));
    }
}
class Solution {
    public int getMaxLen(int[] nums) {
          int max = 0;
         for (int i = 0; i < nums.length; i++) {
             //System.out.println("i = "+i+" nums[i] = "+nums[i]);
              if (nums.length - i <= max) {
                  System.out.println("max = "+max);
                   return max;
              }
              if (nums [i] != 0) {
                  System.out.println("i = "+i+" nums[i] = "+nums[i]);
                  
                   int negatives = nums[i] > 0 ? 0 : 1;
                   System.out.println("negative = "+negatives);
                  
                   max = Math.max(max, nums [i] > 0 ? 1 : 0);
                   System.out.println("max = "+max);
                   
                   for (int j = i + 1; j < nums.length; j++) {
                       if (nums[j] < 0) {
                             negatives++;
                             System.out.println("negative2 = "+negatives);
                         } else if (nums [j] == 0) {
                             break;
                        }
                        if (negatives % 2 == 0) {
                            System.out.println("i = "+i+ " j = "+j);
                             max = Math.max(max, j - i + 1);
                             System.out.println("max2 = "+max);
                        }
                   }
              }
         }
          return max;
    }
}