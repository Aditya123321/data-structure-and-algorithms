package practice.java.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(getIndices(nums1, target1))); // Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3))); // Output: [0, 1]
    }
    public static int[] twoSum(int[] nums, int target) {

        //approach 1
        //using hashmap to reduce search and retrieval complexity
        //time complexity now is O(n)
        //hashmap retrieval time is O(1)
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int secondKey = target - nums[i];
            if(twoSumMap.containsKey(secondKey)) {
                return new int[]{twoSumMap.get(secondKey), i};
            }
            twoSumMap.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }


    public static int[] getIndices(int[] nums, int target) {
        // Create an array of pairs (value, index)
        int[][] numsWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i;
        }
        //approach 2
        // Use two pointers to find the two numbers that add up to the target
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
            if (sum == target) {
                return new int[] { numsWithIndex[left][1], numsWithIndex[right][1] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1,-1};
    }
}
