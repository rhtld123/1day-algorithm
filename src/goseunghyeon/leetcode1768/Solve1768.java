package goseunghyeon.leetcode1768;

public class Solve1768 {

  public static String mergeAlternately(String word1, String word2) {
    int word1Length = word1.length();
    int word2Length = word2.length();
    int totalLength = Math.max(word1Length, word2Length);
    String result = "";
    for (int i = 0; i < totalLength; i++) {
      if (i < word1Length) {
        result += word1.charAt(i);
      }

      if (i < word2Length) {
        result += word2.charAt(i);
      }

    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(mergeAlternately("abc", "pqr"));
    System.out.println(mergeAlternately("ab", "pqrs"));
    System.out.println(mergeAlternately("abcd", "pq"));
  }
}
