/**
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 */

package HackerRank.Java;

import java.io.*;

class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    for (int idx = 1; idx < 11; idx++) {
      System.out.println(N + " x " + idx + " = " + N * idx);
    }

    bufferedReader.close();
  }
}
