/*
https://leetcode.com/problems/search-insert-position/description/
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        if (nums[nums.length-1]<target) {
            s = nums.length;
        }
        else {
            for (int i=0; i<nums.length; i++) {
                if((nums[i] == target) || (nums[i] > target)) {
                    s = i;
                    break;
                }
            }
        }
        
        return s;
    }
}