/*
https://leetcode.com/problems/two-sum/description/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for (int i=0; i<=nums.length-1; i++) {
            for (int j=i; j<=nums.length-1; j++) {
                if (i==j) {
                    continue;
                }
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}