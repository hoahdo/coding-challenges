/**
 * https://www.hackerrank.com/challenges/pangrams/problem
 */

package HackerRank.Algorithms;

import java.util.*;

class Result {

  /*
   * Complete the 'pangrams' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String pangrams(String s) {
    // Write your code here
    if (s.length() < 26) {
      return "not pangram";
    }

    String noSpacesStr = s.replaceAll("\\s", "");
    String formattedStr = noSpacesStr.toLowerCase();
    char[] strArray = formattedStr.toCharArray();

    HashSet<Character> hSet = new HashSet<>();

    for (int idx = 0; idx < strArray.length; idx++) {
      if (hSet.contains(strArray[idx])) {
        continue;
      } else {
        hSet.add(strArray[idx]);
      }
    }

    if (hSet.size() < 26) {
      return "not pangram";
    } else {
      return "pangram";
    }

  }
}
