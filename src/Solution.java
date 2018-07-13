/**
 * This problem is a simple dynamic programming problem
 *
 * "You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police."
 *
 * Basically you can iterate through the given array and keep track of the last house robbed and compare with the
 * maximum sum
 */

public class Solution {

    public int rob(int[] num){
        int lastNotRobbed = 0;
        int lastRobbed = 0;

        for(int v: num){
            int temp = lastNotRobbed;
            lastNotRobbed = Math.max(lastNotRobbed, v + lastRobbed);
            lastRobbed = temp;
        }
        return Math.max(lastRobbed, lastNotRobbed);
    }
}
