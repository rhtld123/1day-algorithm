package goseunghyeon.leetcode283;

import java.util.Arrays;

public class Solve283 {

  public static void moveZeroes(int[] nums) {
    int temp = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == 0) {
          temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }

    System.out.println("nums = " + Arrays.toString(nums));
  }

  public static void main(String[] args) {
    moveZeroes(new int[]{0, 1, 0, 3, 12});
    moveZeroes(new int[]{0});
  }
}
