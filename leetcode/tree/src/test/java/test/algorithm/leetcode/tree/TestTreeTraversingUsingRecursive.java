/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.algorithm.leetcode.tree;

import com.creambing.algorithm.leetcode.tree.BinaryTreeV1;
import com.creambing.algorithm.leetcode.tree.TreeTraversingUsingRecursive;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestTreeTraversingUsingRecursive
 * Description: 测试TreeTraversingUsingRecursive
 *
 * author: CreamBing
 * time: 2019-02-20 22:24
 * version: v1.0.0
 */
public class TestTreeTraversingUsingRecursive {

   private static BinaryTreeV1<Integer> root = BinaryTreeV1Utils.ROOT;

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

    @Test
    public void testPreorderTraversal(){
        List<Integer> list = new ArrayList<>();
        TreeTraversingUsingRecursive.preorderTraversal(root,list);
        assertThat(list,contains(1, 2, 3,4,2,4,3));
    }

    @Test
    public void testInOrderTraversal(){
        List<Integer> list = new ArrayList<>();
        TreeTraversingUsingRecursive.inOrderTraversal(root,list);
        assertThat(list,contains(3,2,4,1,4,2,3));
    }

    @Test
    public void testPostOrderTraversal(){
        List<Integer> list = new ArrayList<>();
        TreeTraversingUsingRecursive.postOrderTraversal(root,list);
        assertThat(list,contains(3,4,2,4,3,2,1));
    }
}
