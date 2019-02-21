/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.algorithm.leetcode.tree;

import com.creambing.algorithm.leetcode.tree.BinaryTreeV1;

/**
 * Class Name: BinaryTreeV1Utils
 * Description: 二叉树工具
 * <p>
 * author: CreamBing
 * time: 2019-02-22 0:18
 * version: v1.0.0
 */
public class BinaryTreeV1Utils {

    protected static BinaryTreeV1<Integer> ROOT = new BinaryTreeV1<>(1);

    /**
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     */
    static {
        BinaryTreeV1<Integer> left1 = new BinaryTreeV1<>(2);
        BinaryTreeV1<Integer> left11 = new BinaryTreeV1<>(3);
        BinaryTreeV1<Integer> left12 = new BinaryTreeV1<>(4);
        BinaryTreeV1<Integer> right1 = new BinaryTreeV1<>(2);
        BinaryTreeV1<Integer> right11 = new BinaryTreeV1<>(4);
        BinaryTreeV1<Integer> right12 = new BinaryTreeV1<>(3);
        ROOT.setLeft(left1);
        ROOT.setRight(right1);
        left1.setLeft(left11);
        left1.setRight(left12);
        right1.setLeft(right11);
        right1.setRight(right12);
    }
}
