import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinct = 1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinct++;
                if (distinct == 3) {
                    return nums[i];
                }
            }
        }

        // If less than 3 distinct numbers, return maximum
        return nums[n - 1];
    }
}