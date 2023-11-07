/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */

package HackerRank.Algorithms;

class Result {

  /*
   * Complete the 'appendAndDelete' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   * 1. STRING s
   * 2. STRING t
   * 3. INTEGER k
   */

  public static String appendAndDelete(String s, String t, int k) {
    // Write your code here

    char[] s_Str = s.toCharArray();
    char[] t_Str = t.toCharArray();

    int s_StrLen = s.length();
    int t_StrLen = t.length();
    int totalLen = s.length() + t.length();

    // case 1
    if (totalLen < k) {
      return "Yes";
    }

    int commonCharsCount = 0;
    int shorterStr = (s_StrLen < t_StrLen) ? s_StrLen : t_StrLen;
    for (int i = 0; i < shorterStr; i++) {
      if (s_Str[i] != t_Str[i]) {
        break;
      }
      commonCharsCount++;
    }

    // case 2 && case 3
    if ((k + 2 * commonCharsCount >= totalLen) && (totalLen % 2 == k % 2)) {
      return "Yes";
    }

    return "No";

  }

}
