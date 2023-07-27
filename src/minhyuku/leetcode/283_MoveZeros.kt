package minhyuku.leetcode

import java.util.*

/**
 *283. Move Zeroes
 *
 * Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 * ```
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * ```
 *
 * Example 2:
 * ```
 * Input: nums = [0]
 * Output: [0]
 * ```
 *
 * Constraints:
 *
 * * `1 <= nums.length <= 104`
 * * `-231 <= nums[i] <= 231 - 1`
 *
 */
class `283` {
    companion object {
        fun solutions(data: Array<Int>): Array<Int> {
            var nonZeroCount = 0
            for (i in data.indices) {
                if (data[i] != 0) {
                    data[nonZeroCount] = data[i]
                    nonZeroCount += 1;
                }
            }
            Arrays.fill(data, nonZeroCount, data.size, 0)
            return data;
        }
    }
}

fun main() {
    println(`283`.solutions(arrayOf(0, 1, 0, 3, 12)).contentToString())
    println(`283`.solutions(arrayOf(0)).contentToString())
}