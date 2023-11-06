package LeetCode;

import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> values = new HashSet<>();

    for (int x = 0; x < nums.length; x++) {

      if (values.contains(nums[x])) {
        return true;
      }

      values.add(nums[x]);

    }

    return false;
  }
}

/**
 * uses HashSet
 * if next value in array is already contained in HashSet
 * return true, because duplicate was found
 * 
 * similar to when i would use two arrays and compare them to each other
 * i.e. comparator array and working array
 * 
 * ~~~~~
 * testing to see if same solution can be derived with ArrayList
 * solution works with ArrayList
 * 
 * main differences between the two:
 * ArrayList allows duplicate values
 * ArrayList maintains insertion order
 * HashSet doesnt allow duplicate values
 * HashSet is an unordered collection; doesnt maintain any order
 */
