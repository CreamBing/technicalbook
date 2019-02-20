/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.algorithm.leetcode.tree;

import com.creambing.algorithm.leetcode.tree.BinaryTreeV1;
import com.creambing.algorithm.leetcode.tree.TreeTraversingUsingRecursive;
import org.junit.Test;

/**
 * Class Name: TestTreeTraversingUsingRecursive
 * Description: 测试TreeTraversingUsingRecursive
 *
 * author: CreamBing
 * time: 2019-02-20 22:24
 * version: v1.0.0
 */
public class TestTreeTraversingUsingRecursive {

    private static BinaryTreeV1<Integer> root = new BinaryTreeV1<>(1);

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
        root.setLeft(left1);
        root.setRight(right1);
        left1.setLeft(left11);
        left1.setRight(left12);
        right1.setLeft(right11);
        right1.setRight(right12);
    }

    @Test
    public void testPreorderTraversalPrint(){
        TreeTraversingUsingRecursive.preorderTraversalPrint(root);
        System.out.println("前序遍历");
    }

    @Test
    public void testInOrderTraversalPrint(){
        TreeTraversingUsingRecursive.inOrderTraversalPrint(root);
        System.out.println("中序遍历");
    }

    @Test
    public void testPostOrderTraversalPrint(){
        TreeTraversingUsingRecursive.postOrderTraversalPrint(root);
        System.out.println("后序遍历");
    }
}
