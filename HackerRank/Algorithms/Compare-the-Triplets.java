/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'compareTriplets' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   * 1. INTEGER_ARRAY a
   * 2. INTEGER_ARRAY b
   */

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    List<Integer> result = new ArrayList<Integer>();
    int alice = 0;
    int bob = 0;
    for (int idx = 0; idx < a.size(); idx++) {
      if (a.get(idx) > b.get(idx)) {
        alice = alice + 1;
      } else if (a.get(idx) < b.get(idx)) {
        bob = bob + 1;
      } else {
        continue;
      }
    }
    result.add(0, alice);
    result.add(1, bob);
    return result;
  }
}
