package goseunghyeon.leetcode238;

import java.util.Arrays;

public class Solve238 {

  public static int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int temp = 1;

    for (int i = 0; i < nums.length; i++) {
      result[i] = temp;
      temp *= nums[i];
    }
    temp = 1;

    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= nums[i];
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
  }
}
