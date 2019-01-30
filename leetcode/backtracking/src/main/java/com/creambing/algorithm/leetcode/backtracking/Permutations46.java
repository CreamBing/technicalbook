/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class Name: Permutations46
 * Description: 不重复全排列
 *
 * author: CreamBing
 * time: 2019-01-10 21:32
 * version: v1.0.0
 */
public class Permutations46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(list, nums, 0);
        return list;
    }

    private void backtracking(List<List<Integer>> list, int[] nums, int n) {
        if (n == nums.length - 1) {
            list.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        } else {
            int swap;
            for (int i = n, m = nums.length; i < m; i++) {
                swap = nums[i];
                nums[i] = nums[n];
                nums[n] = swap;
                backtracking(list, nums, n+1);
                swap = nums[i];
                nums[i] = nums[n];
                nums[n] = swap;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        new Permutations46().permute(a).forEach(System.out::println);
    }
}
