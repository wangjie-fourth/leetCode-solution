package twoSum;

import java.util.Arrays;

/**
 *
 */
public class TwoSum02 {

    // 双指针思路
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            throw new RuntimeException("nums数组大小不能低于2");
        }
        Arrays.sort(nums);
        int lower = 0;
        int high = nums.length - 1;

        while (lower <= high){
            int nowNum = nums[lower] + nums[high];
            if (nowNum > target) {
                --high;
            } else if (nowNum < target) {
                ++lower;
            } else {
                return new int[]{nums[lower], nums[high]};
            }
        }
        throw new RuntimeException("该数组不存在target的俩个值");
    }
}
