package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组`nums`和一个整数目标值`target`，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 你可以按任意顺序返回答案。
 */
public class TwoSum01 {

    // 暴力解法
    public int[] twoSum01(int[] nums, int target) {
        if (nums.length < 2) {
            throw new RuntimeException("nums数组大小不能低于2");
        }

        for (int i = 0; i < nums.length; i++) {
            int a1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int a2 = nums[j];
                if (j == i) {
                    continue;
                } else if (a1 + a2 == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("该数组不存在target的俩个值");
    }

    // 哈希表解法
    public int[] twoSum02(int[] nums, int target) {
        if (nums.length < 2) {
            throw new RuntimeException("nums数组大小不能低于2");
        }
        // 将nums存在这个hashMap，后面去获取
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a1 = nums[i];

            // 看hashMap有没有
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        throw new RuntimeException("该数组不存在target的俩个值");
    }
}
