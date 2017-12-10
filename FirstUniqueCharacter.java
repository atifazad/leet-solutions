/*
https://leetcode.com/problems/first-unique-character-in-a-string/description/
*/
class Solution {
    public int firstUniqChar(String s) {
        char[] sArr = s.toCharArray();
        for (int i=0; i<sArr.length; i++) {
            if(s.indexOf(sArr[i])==s.lastIndexOf(sArr[i])) {
                return i;
            }
        }
        return -1;
    }
}