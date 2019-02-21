/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.tree;

import java.util.Collection;

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
    //考察到一个节点后，即刻输出该节点的值，并继续遍历其左右子树。(根左右)
    public static void preorderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            System.out.print(binaryTreeV1Root.getValue()+"\t");
            preorderTraversalPrint(binaryTreeV1Root.getLeft());
            preorderTraversalPrint(binaryTreeV1Root.getRight());
        }
    }

    //前序遍历存储
    public static <T> void preorderTraversal(BinaryTreeV1<T> binaryTreeV1Root, Collection<T> c){
        if(binaryTreeV1Root!=null){
            c.add(binaryTreeV1Root.getValue());
            preorderTraversal(binaryTreeV1Root.getLeft(),c);
            preorderTraversal(binaryTreeV1Root.getRight(),c);
        }
    }

    //中序遍历打印
    //考察到一个节点后，将其暂存，遍历完左子树后，再输出该节点的值，然后遍历右子树。(左根右)
    public static void inOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            inOrderTraversalPrint(binaryTreeV1Root.getLeft());
            System.out.print(binaryTreeV1Root.getValue()+"\t");
            inOrderTraversalPrint(binaryTreeV1Root.getRight());
        }
    }

    //中序遍历存储
    public static <T> void inOrderTraversal(BinaryTreeV1<T> binaryTreeV1Root,Collection<T> c){
        if(binaryTreeV1Root!=null){
            inOrderTraversal(binaryTreeV1Root.getLeft(),c);
            c.add(binaryTreeV1Root.getValue());
            inOrderTraversal(binaryTreeV1Root.getRight(),c);
        }
    }

    //后序遍历打印
    //考察到一个节点后，将其暂存，遍历完左右子树后，再输出该节点的值。(左右根)
    public static void postOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root){
        if(binaryTreeV1Root!=null){
            postOrderTraversalPrint(binaryTreeV1Root.getLeft());
            postOrderTraversalPrint(binaryTreeV1Root.getRight());
            System.out.print(binaryTreeV1Root.getValue()+"\t");
        }
    }

    //后序遍历存储
    public static <T> void postOrderTraversal(BinaryTreeV1<T> binaryTreeV1Root,Collection<T> c){
        if(binaryTreeV1Root!=null){
            postOrderTraversal(binaryTreeV1Root.getLeft(),c);
            postOrderTraversal(binaryTreeV1Root.getRight(),c);
            c.add(binaryTreeV1Root.getValue());
        }
    }
}
