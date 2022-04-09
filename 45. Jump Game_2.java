class Main{
    public static void main(String[] args){
        int [] arr = {2,3,0,1,4,2,3,1,1,4};
        Solution s = new Solution();
        System.out.println("Output: " + s.jump(arr));
    }
}
class Solution {
    public int jump(int[] nums) {
        int end=0,farthest_index = 0, jump =0;
        for(int i=0; i<nums.length-1; i++)
        {
            farthest_index = Math.max(farthest_index, i+nums[i]);
            System.out.println("i =" +i+ " nums = " +nums[i]+ " far = " +farthest_index );
            if(i == end)
            {
                jump++;
                System.out.println("Jump = "+jump);
                end = farthest_index;
                System.out.println("End = "+end);
            }
        }
        return jump;
    }
}


