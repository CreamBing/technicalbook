/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.dynamicprogramming;

/**
 * Class Name: ClimbingStairs70
 * Description: 假设你正在爬楼梯。需要 *n* 阶你才能到达楼顶每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * author: CreamBing
 * time: 2019-02-19 23:47
 * version: v1.0.0
 */
public class ClimbingStairs70 {

    /**
     * 自底向上的动态规划
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int twoStepBefore = 1;//3 2+1
        int oneStepBefore = 2;//3 1+1+1 1+2
        int allWays = 0;
        for(int i=2;i<n;i++){
            allWays = twoStepBefore + oneStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }
}
