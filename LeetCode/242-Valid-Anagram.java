package LeetCode;

import java.util.Arrays;

class Solution {
  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
      return false;
    }

    char[] sArray = s.toCharArray();
    char[] tArray = t.toCharArray();

    Arrays.sort(sArray);
    Arrays.sort(tArray);

    for (int idx = 0; idx < sArray.length; idx++) {
      if (sArray[idx] != tArray[idx]) {
        return false;
      } else {
        continue;
      }
    }

    return true;
  }
}

/**
 * anagrams have same characters and length
 * 
 * check if both strings are the same length
 * 
 * covert the strings into an array of chars
 * sort the two arrays with Arrays.sort() method
 * 
 * compare each index of each array to each other
 * the first non match returns false; not anagram
 * else return true; is anagram
 * 
 * try using mismatch Arrays method
 * try using equals Arrays method
 */
