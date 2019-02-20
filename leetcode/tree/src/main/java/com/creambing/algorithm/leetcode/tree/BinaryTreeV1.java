/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.tree;

/**
 * Class Name: BinaryTreeV1
 * Description: 二叉树
 *
 * author: CreamBing
 * time: 2019-02-20 22:15
 * version: v1.0.0
 */
public class BinaryTreeV1<T> {
    //该节点的值
    private T value;
    //左节点
    private BinaryTreeV1<T> left;
    //右节点
    private BinaryTreeV1<T> right;

    public BinaryTreeV1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public BinaryTreeV1<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeV1<T> left) {
        this.left = left;
    }

    public BinaryTreeV1<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeV1<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTreeV1{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
