/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.tree;

/**
 * Class Name: TreeTraversingUsingRecursive
 * Description: 利用递归遍历二叉树
 *
 * author: CreamBing
 * time: 2019-02-20 22:14
 * version: v1.0.0
 */
public class TreeTraversingUsingRecursive {

    //前序遍历打印
    public static void preorderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            System.out.print(binaryTreeV1Root.getValue()+"\t");
            preorderTraversalPrint(binaryTreeV1Root.getLeft());
            preorderTraversalPrint(binaryTreeV1Root.getRight());
        }
    }

    //中序遍历打印
    public static void inOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            inOrderTraversalPrint(binaryTreeV1Root.getLeft());
            System.out.print(binaryTreeV1Root.getValue()+"\t");
            inOrderTraversalPrint(binaryTreeV1Root.getRight());
        }
    }

    //后序遍历打印
    public static void postOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            postOrderTraversalPrint(binaryTreeV1Root.getLeft());
            postOrderTraversalPrint(binaryTreeV1Root.getRight());
            System.out.print(binaryTreeV1Root.getValue()+"\t");
        }
    }
}
