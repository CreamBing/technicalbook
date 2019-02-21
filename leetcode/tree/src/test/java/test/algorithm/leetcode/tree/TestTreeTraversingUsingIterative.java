/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.algorithm.leetcode.tree;

import com.creambing.algorithm.leetcode.tree.BinaryTreeV1;
import com.creambing.algorithm.leetcode.tree.TreeTraversingUsingIterative;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestTreeTraversingUsingIterative
 * Description: 测试非递归版本的二叉树遍历
 *
 * author: CreamBing
 * time: 2019-02-22 0:17
 * version: v1.0.0
 */
public class TestTreeTraversingUsingIterative {

    private static BinaryTreeV1<Integer> root = BinaryTreeV1Utils.ROOT;

    @Test
    public void testPreorderTraversalPrint(){
        TreeTraversingUsingIterative.preorderTraversalPrint(root);
        System.out.println("前序遍历");
    }

    @Test
    public void testInOrderTraversalPrint(){
        TreeTraversingUsingIterative.inOrderTraversalPrint(root);
        System.out.println("中序遍历");
    }

    @Test
    public void testPostOrderTraversalPrint(){
        TreeTraversingUsingIterative.postOrderTraversalPrint(root);
        System.out.println("后序遍历");
    }

    @Test
    public void testPreorderTraversal(){
        List<Integer> list = TreeTraversingUsingIterative.preorderTraversal(root);
        assertThat(list,contains(1, 2, 3,4,2,4,3));
    }

    @Test
    public void testInOrderTraversal(){
        List<Integer> list = TreeTraversingUsingIterative.inOrderTraversal(root);
        assertThat(list,contains(3,2,4,1,4,2,3));
    }

    @Test
    public void testPostOrderTraversal(){
        List<Integer> list = TreeTraversingUsingIterative.postOrderTraversal(root);
        assertThat(list,contains(3,4,2,4,3,2,1));
    }
}
