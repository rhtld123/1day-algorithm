package goseunghyeon.leetcode1456;

import java.util.List;

/**
 * 1456. Maximum Number of Vowels in a Substring of Given Length Given a string s and an integer k, return the maximum number of vowel letters in any substring
 * of s with length k.
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abciiidef", k = 3 Output: 3 Explanation: The substring "iii" contains 3 vowel letters. Example 2:
 * <p>
 * Input: s = "aeiou", k = 2 Output: 2 Explanation: Any substring of length 2 contains 2 vowels. Example 3:
 * <p>
 * Input: s = "leetcode", k = 3 Output: 2 Explanation: "lee", "eet" and "ode" contain 2 vowels.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105 s consists of lowercase English letters. 1 <= k <= s.length
 */
public class Solution {

  public static int maxVowels(String s, int k) {
    String str = "";
    int max = 0;
    int count = 0;
    List<Character> vowel = List.of('a', 'e', 'i', 'o', 'u');
    for (int i = 0; i < k; i++) {
      if (vowel.contains(s.charAt(i))) {
        max++;
      }
      str += s.charAt(i);
    }
    count = max;
    for (int i = k; i < s.length(); i++) {
      if (str.length() > k) {
        str = str.substring(1);
        if (vowel.contains(s.charAt(i - 1 - k))) {
          count--;
        }
        max = Math.max(max, count);
      }

      if (vowel.contains(s.charAt(i))) {
        count++;
      }

      str += s.charAt(i);
    }

    if (vowel.contains(str.charAt(0))) {
      count--;
    }
    return Math.max(max, count);
  }

  public static void main(String[] args) {
    System.out.println(maxVowels("abciiidef", 3));
    System.out.println(maxVowels("aeiou", 2));
    System.out.println(maxVowels("leetcode", 3));
    System.out.println(maxVowels("weallloveyou", 7));
    System.out.println(maxVowels("stwdhjxixobgzvyhdwqxbfboqjptrlokvwkwtueuigiu", 20));
  }
}
