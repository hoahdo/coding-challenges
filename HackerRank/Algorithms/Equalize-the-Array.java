/**
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'equalizeArray' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static int equalizeArray(List<Integer> arr) {
    // Write your code here

    Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
    int startSize = arr.size();
    int dupeNum = 0;
    int dupeNumCount = 0;

    for (int i = 0; i < arr.size(); i++) {
      if (hMap.containsKey(arr.get(i))) {
        hMap.put(arr.get(i), hMap.get(arr.get(i)) + 1);
      } else {
        hMap.put(arr.get(i), 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
      Integer key = entry.getKey();
      Integer value = entry.getValue();
      if (value > dupeNumCount) {
        dupeNumCount = value;
        dupeNum = key;
      }
    }

    return startSize - hMap.get(dupeNum);
  }

}
