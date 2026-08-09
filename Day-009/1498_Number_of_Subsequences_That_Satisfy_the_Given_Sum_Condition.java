import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {

        int MOD = 1_000_000_007;

        Arrays.sort(nums);

        int n = nums.length;

        int[] pow2 = new int[n];
        pow2[0] = 1;

        for (int i = 1; i < n; i++) {
            pow2[i] = (int)((pow2[i - 1] * 2L) % MOD);
        }

        int left = 0;
        int right = n - 1;

        long answer = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                answer = (answer + pow2[right - left]) % MOD;

                left++;

            } else {

                right--;
            }
        }

        return (int) answer;
    }
}