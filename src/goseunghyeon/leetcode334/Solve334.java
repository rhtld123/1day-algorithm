package goseunghyeon.leetcode334;

public class Solve334 {
  public static boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) {
      return false;
    }

    int min = Integer.MAX_VALUE;
    int mid = Integer.MAX_VALUE;

    for (int num : nums) {
      if (min >= num) {
        min = num;
      } else if (mid >= num) {
        mid = num;
      } else {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
//    System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    System.out.println(increasingTriplet(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
  }
}
