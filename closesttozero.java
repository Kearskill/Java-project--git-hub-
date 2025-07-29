class Solution {
    public int findClosestNumber(int[] nums) {
        int size = nums.length;
        // int smallest = nums[0];
        int smallest = Integer.MAX_VALUE;
        int res=0;
        for (int i=0; i<size;i++){
            if (Math.abs(nums[i])<smallest){
                smallest = Math.abs(nums[i]);
                res = nums[i];
            } else if (smallest == Math.abs(nums[i]) && res<nums[i]){
                res = nums[i];
            }
        }

        return res;
    }
}