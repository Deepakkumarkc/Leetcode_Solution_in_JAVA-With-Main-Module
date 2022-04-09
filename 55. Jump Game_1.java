class Main{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,9};
        Solution s = new Solution();
        System.out.println("Output: " + s.canJump(arr));
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int lastIndexPosition = nums.length -1;
        System.out.println("lastIndexPosition = "+lastIndexPosition);
        for(int i = nums.length-1; i>=0; i--)
        {   System.out.println("i = "+i+" nums=" +nums[i]);
            if(i + nums[i] >= lastIndexPosition)
            {
                lastIndexPosition = i;
                System.out.println("lastposition = "+lastIndexPosition);
            }
        }
            return lastIndexPosition == 0;
        
    }
}