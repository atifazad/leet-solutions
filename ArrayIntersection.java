/*
https://leetcode.com/problems/intersection-of-two-arrays/description/
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] base=nums2;
        int[] iterator=nums1;
        if(nums1.length>nums2.length) {
            base=nums1;
            iterator=nums2;
        }
        
        Arrays.sort(base);
        Arrays.sort(iterator);
        
        int[] res=new int[iterator.length];
        int found=0;
        Boolean zeroFound=false;
        for(int i=0; i<iterator.length; i++) {
            if((iterator[i] == 0  && zeroFound==false && Arrays.binarySearch(base,0)>=0)) {
                
                    res[found] = iterator[i];
                    found+=1;
                    zeroFound=true;
            }
            else if (this.searchVal(res, iterator[i])==false) {
                if(Arrays.binarySearch(base,iterator[i])>=0) {
                    res[found] = iterator[i];
                    found+=1;
                }
            }
        }
        
        res = Arrays.copyOf(res, found);
        return res;
    }
    
    private Boolean searchVal(int[] arr, int k) {
        for(int i=0; i<arr.length; i++) {
            if(k==arr[i]){
                return true;
            }
        }
        return false;
    }
}