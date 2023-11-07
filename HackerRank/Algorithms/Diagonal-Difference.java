/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here

    int leftDiagSum = 0;
    int rightDiagSum = 0;

    for (int otrIdx = 0; otrIdx < arr.size(); otrIdx++) {
      for (int inrIdx = 0; inrIdx < arr.get(otrIdx).size(); inrIdx++) {

        if (otrIdx == inrIdx) {
          leftDiagSum = leftDiagSum + arr.get(otrIdx).get(inrIdx);
        }

        if (otrIdx == (arr.get(otrIdx).size() - 1 - inrIdx)) {
          rightDiagSum = rightDiagSum + arr.get(otrIdx).get(inrIdx);
        }
      }
    }

    return Math.abs(leftDiagSum - rightDiagSum);
  }

}
