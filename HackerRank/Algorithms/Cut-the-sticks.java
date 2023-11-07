/**
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'cutTheSticks' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here

    List<Integer> sticksCutResult = new ArrayList<Integer>();
    List<Integer> sticksArr = new ArrayList<Integer>(arr);

    while (sticksArr.isEmpty() == false) {

      // add the remaining stick count to sticksCut result list
      sticksCutResult.add(sticksArr.size());

      // reset shortest stick length value
      int shortStick = Integer.MAX_VALUE;
      // find the current shortest stick length
      for (int i = 0; i < sticksArr.size(); i++) {
        if (sticksArr.get(i) < shortStick) {
          shortStick = sticksArr.get(i);
        }
      }

      // reduce length of all nonzero sticks by shortest stick length
      for (int i = 0; i < sticksArr.size(); i++) {
        sticksArr.set(i, sticksArr.get(i) - shortStick);
      }

      // remove stick lengths of zero from array, before Java 8
      for (int i = 0; i < sticksArr.size(); i++) {
        if (sticksArr.get(i) == 0) {
          sticksArr.remove(i);
          i--;
        }
      }

      // remove stick lengths of zero from array, after Java 8
      // sticksArr.removeIf(stickLength -> stickLength == 0);
    }

    return sticksCutResult;

  }

}
