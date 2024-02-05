package src.P0001_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(solution.twoSum(nums, target)));
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIdxMap = new HashMap<>(nums.length);

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int num2 = target - num;

      if (numToIdxMap.containsKey(num2)) {
        return new int[]{numToIdxMap.get(num2), i};
      } else {
        numToIdxMap.put(num, i);
      }
    }

    throw new IllegalArgumentException("No solution.");
  }

}
