class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target && i !=j ){
                    int[]  ans = new int[2];
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[2];
    }
}