/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Class Name: TreeTraversingUsingIterative
 * Description: 利用迭代遍历二叉树
 * <p>
 * author: CreamBing
 * time: 2019-02-21 23:09
 * version: v1.0.0
 */
public class TreeTraversingUsingIterative {

    //前序遍历打印
    //考察到一个节点后，即刻输出该节点的值，并继续遍历其左右子树。(根左右)
    public static void preorderTraversalPrint(BinaryTreeV1 binaryTreeV1Root) {
        if (binaryTreeV1Root == null) {
            return;
        }
        Stack<BinaryTreeV1> stack = new Stack<>();
        stack.push(binaryTreeV1Root);
        while (!stack.isEmpty()) {
            BinaryTreeV1 root = stack.peek();
            System.out.print(root.getValue() + "\t");
            stack.pop();
            //下面的顺序不能乱
            if (root.getRight() != null) {
                stack.push(root.getRight());
            }
            if (root.getLeft() != null) {
                stack.push(root.getLeft());
            }
        }
    }

    //前序遍历存储
    public static <T> List<T> preorderTraversal(BinaryTreeV1<T> binaryTreeV1Root) {
        if (binaryTreeV1Root == null) {
            throw new NullPointerException("binaryTree is null!");
        }
        Stack<BinaryTreeV1<T>> stack = new Stack<>();
        stack.push(binaryTreeV1Root);
        List<T> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            BinaryTreeV1<T> root = stack.peek();
            list.add(root.getValue());
            stack.pop();
            //下面的顺序不能乱
            if (root.getRight() != null) {
                stack.push(root.getRight());
            }
            if (root.getLeft() != null) {
                stack.push(root.getLeft());
            }
        }
        return list;
    }

    //中序遍历打印
    //考察到一个节点后，将其暂存，遍历完左子树后，再输出该节点的值，然后遍历右子树。(左根右)
    public static void inOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root) {
        if (binaryTreeV1Root == null) {
            return;
        }
        Stack<BinaryTreeV1> stack = new Stack<>();
        BinaryTreeV1 curr = binaryTreeV1Root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            System.out.print(curr.getValue() + "\t");
            curr = curr.getRight();
        }
    }

    //中序遍历存储
    public static <T> List<T> inOrderTraversal(BinaryTreeV1<T> binaryTreeV1Root) {
        if (binaryTreeV1Root == null) {
            throw new NullPointerException("binaryTree is null!");
        }
        Stack<BinaryTreeV1<T>> stack = new Stack<>();
        BinaryTreeV1<T> curr = binaryTreeV1Root;
        List<T> list = new ArrayList<>();
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.getLeft();
            }
            curr = stack.pop();
            list.add(curr.getValue());
            curr = curr.getRight();
        }
        return list;
    }

    //后序遍历打印
    //考察到一个节点后，将其暂存，遍历完左右子树后，再输出该节点的值。(左右根)
    public static void postOrderTraversalPrint(BinaryTreeV1 binaryTreeV1Root) {
        Stack<BinaryTreeV1> treeNodeStack = new Stack<>();
        BinaryTreeV1 node = binaryTreeV1Root;
        BinaryTreeV1 lastVisit = binaryTreeV1Root;
        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.getLeft();
            }
            //查看当前栈顶元素
            node = treeNodeStack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (node.getRight() == null || node.getRight() == lastVisit) {
                System.out.print(node.getValue() + "\t");
                treeNodeStack.pop();
                lastVisit = node;
                node = null;
            } else {
                //否则，继续遍历右子树
                node = node.getRight();
            }
        }
    }

    //后序遍历存储
    public static <T> List<T> postOrderTraversal(BinaryTreeV1<T> binaryTreeV1Root) {
        Stack<BinaryTreeV1<T>> treeNodeStack = new Stack<>();
        BinaryTreeV1<T> node = binaryTreeV1Root;
        BinaryTreeV1<T> lastVisit = binaryTreeV1Root;
        List<T> list = new ArrayList<>();
        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                treeNodeStack.push(node);
                node = node.getLeft();
            }
            //查看当前栈顶元素
            node = treeNodeStack.peek();
            //如果其右子树也为空，或者右子树已经访问
            //则可以直接输出当前节点的值
            if (node.getRight() == null || node.getRight() == lastVisit) {
                list.add(node.getValue());
                treeNodeStack.pop();
                lastVisit = node;
                node = null;
            } else {
                //否则，继续遍历右子树
                node = node.getRight();
            }
        }
        return list;
    }
}
