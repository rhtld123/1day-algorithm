package minhyuku.leetcode

/**
 *1768. Merge Strings Alternately
 *
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 *
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 */
class `1768` {
    companion object {
        fun solutions(word1: String, word2: String) {
            val splitword1 = word1.chunked(1)
            val splitword2 = word2.chunked(1)

            val length = if (word1.length >= word2.length) word1.length else word2.length

            val word3 = mutableListOf<String>()

            for (i in 0 until length) {
                if (splitword1.size > i) {
                    word3.add(splitword1[i])
                }
                if (splitword2.size > i) {
                    word3.add(splitword2[i])
                }
            }

            val joinToString = word3.joinToString()
            println(joinToString)
        }
    }
}

fun main() {
    `1768`.solutions("abc", "pqr");
    `1768`.solutions("ab", "pqrs");
}