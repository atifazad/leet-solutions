/*
https://leetcode.com/problems/find-the-difference/description/
*/
class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();
        int sum = tArray[tArray.length-1];
        for(int i=0; i<sArray.length; i++) {
            sum+=(tArray[i]-sArray[i]);
        }
        return (char)sum;
    }
}
