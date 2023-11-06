package LeetCode;

import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> hMap = new HashMap<>();
    int[] result = new int[2];

    for (int idx = 0; idx < nums.length; idx++) {
      if (hMap.containsKey((target - nums[idx]))) {
        result[0] = idx;
        result[1] = hMap.get((target - nums[idx]));
        break;
      } else {
        hMap.put(nums[idx], idx);
      }

    }

    return result;
  }
}

/**
 * if target minus value not found in map
 * add value and index to map
 */
