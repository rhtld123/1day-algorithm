package goseunghyeon.leetcode643;

/**
 * 643. Maximum Average Subarray I
 * <p>
 * You are given an integer array nums consisting of n elements, and an integer k.
 * <p>
 * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than
 * 10-5 will be accepted.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,12,-5,-6,50,3], k = 4 Output: 12.75000 Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75 Example 2:
 * <p>
 * Input: nums = [5], k = 1 Output: 5.00000
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == nums.length 1 <= k <= n <= 105 -104 <= nums[i] <= 104
 */
public class Solve643 {

  public static double findMaxAverage(int[] nums, int k) {
    if (k == 1 && nums.length == 1) {
      return (double) nums[0] / k;
    }
    double sum = 0;
    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    double max = sum;
    for (int i = k; i < nums.length; i++) {
      sum = sum + nums[i] - nums[i - k];
      max = Math.max(max, sum);
    }

    return max / k;
  }

  public static void main(String[] args) {
    System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    System.out.println(findMaxAverage(new int[]{5}, 1));
  }
}
