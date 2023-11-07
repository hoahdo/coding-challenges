/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long sum = 0;
    for (int idx = 0; idx < arr.size(); idx++) {
      sum = sum + arr.get(idx);
    }
    long minSum = sum - arr.get(arr.size() - 1);
    long maxSum = sum - arr.get(0);
    System.out.println(minSum + " " + maxSum);
  }
}
