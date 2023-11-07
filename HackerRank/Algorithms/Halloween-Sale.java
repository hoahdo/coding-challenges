/**
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 */

package HackerRank.Algorithms;

class Result {

  /**
   * Complete the 'howManyGames' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   * 1. INTEGER p - price of first game
   * 2. INTEGER d - discount from previous game price
   * 3. INTEGER m - minimum cost of a game
   * 4. INTEGER s - starting budget
   *
   * CONSTRAINTS
   * 1 <= m <= p <= 100
   * 1 <= d <= 100
   * 1 <= s <= 10000
   */

  public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy

    for (int numOfGames = 0; s >= 0; numOfGames++) {
      int priceOfDiscountedGame = (p - (d * numOfGames));
      int priceOfGame = (priceOfDiscountedGame > m) ? priceOfDiscountedGame : m;

      if (s - priceOfGame >= 0) {
        s -= priceOfGame;
      } else {
        return numOfGames;
      }

    }

    return 0;
  }
}
