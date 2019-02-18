/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.divideandconquer;

/**
 * Class Name: MaximumSubarray53
 * Description: 最大子序和
 * Url: https://leetcode.com/problemset/top-100-liked-questions/
 * <p>
 * author: CreamBing
 * time: 2019-02-18 14:45
 * version: v1.0.0
 */
public class MaximumSubarray53 {

    //一直累加,保存最大的累加值,如果累加结果出现负数,重置累加结果为0,再次累加
    //时间复杂度为o(n),没有用到分治的思想
    //Runtime: 6 ms, faster than 99.94% of Java online submissions for Maximum Subarray.
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for (int val : nums) {
            sum += val;
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
    /*
    Divide-and-conquer method.
    The maximum summation of subarray can only exists under following conditions:
    1. the maximum summation of subarray exists in left half.
    2. the maximum summation of subarray exists in right half.
    3. the maximum summation of subarray exists crossing the midpoints to left and right.
    1 and 2 can be reached by using recursive calls to left half and right half of the subarraies.
    Condition 3 can be found starting from the middle point to the left,
    then starting from the middle point to the right. Then adds up these two parts and return.

    T(n) = 2*T(n/2) + O(n)
    this program runs in O(nlogn) time
    */

        int maxsum = subArray(nums, 0, nums.length-1);
        return maxsum;
    }

    private int subArray(int[] A, int left, int right){
        if (left == right){
            //base case
            return A[left];
        }
        int mid = left + (right-left)/2;
        int leftsum = subArray(A, left, mid); //left part of the subarray sum, condition 1
        int rightsum = subArray(A, mid+1, right); //right part of the subarray sum, condition 2
        int middlesum = midSubArray(A, left, mid, right); //cross part of the subarray sum, condition 3
        // System.out.println(leftsum);
        // System.out.println(rightsum);
        // System.out.println(middlesum);

        //following if condition will return middlesum if lost the "=" under the conditon of leftsum = rightsum, which may be problematic if leftsum = rightsum < middlesum.
        //for example: [-1, -1, -2, -2]
        if (leftsum >= rightsum && leftsum >= middlesum){
            return leftsum;
        }
        if (rightsum >= leftsum && rightsum >= middlesum){
            return rightsum;
        }
        return middlesum;
    }

    private int midSubArray(int[] A, int left, int mid, int right){
        int leftsum = Integer.MIN_VALUE;
        int rightsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--){
            sum += A[i];
            if (leftsum < sum){
                leftsum = sum;
            }
        }

        sum = 0;
        for (int j = mid + 1; j <= right; j++){
            sum += A[j];
            if (rightsum < sum){
                rightsum = sum;
            }
        }

        return leftsum + rightsum;
    }


}
