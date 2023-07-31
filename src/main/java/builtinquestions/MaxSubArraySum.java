package builtinquestions;

public class MaxSubArraySum {
    //Kadane's algorithm is an algo to find the max sub-array sum in a given array of integers
    public static void main(String[] args) {
        int[] nums = {-2, -1, -3, -4, -1, 2, 1, -5, 0, 4};
        int result = maxSubarraySum(nums);
        System.out.println(result);
    }
    private static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
