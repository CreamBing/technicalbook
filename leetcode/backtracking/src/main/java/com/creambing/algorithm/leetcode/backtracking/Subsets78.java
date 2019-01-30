/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Name: Subsets78
 * Description: 不重复的子集
 *
 * author: CreamBing
 * time: 2019-01-12 23:05
 * version: v1.0.0
 */
public class Subsets78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> re = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0,n=nums.length;i<=n;i++){
            combination(list,re,nums,0,i);
            result.addAll(new ArrayList<>(re));
            re.clear();
        }
        return result;
    }

    static void combination(List<Integer> l,List<List<Integer>> result,int[] nums,int n,int k){
        if(k==0){
            result.add(new ArrayList<>(l));
        }
        else {
            for(int i = n,m = nums.length;i<m;i++){
                l.add(nums[i]);
                combination(l,result,nums,i+1,k-1);
                l.remove(l.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3};
        new Subsets78().subsets(num).forEach(System.out::println);
    }
}
