/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Class Name: SymmetricTree101
 * Description: 对称树
 * <p>
 * <p>
 * author: CreamBing
 * time: 2019-02-20 21:14
 * version: v1.0.0
 */
public class SymmetricTree101 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;
        if (root.left != null) {
            if (root.right == null) return false;
            stack.push(root.left);
            stack.push(root.right);
        } else if (root.right != null) {
            return false;
        }
        while (!stack.empty()) {
            if (stack.size() % 2 != 0) return false;
            right = stack.pop();
            left = stack.pop();
            if (right.val != left.val) return false;

            if (left.left != null) {
                if (right.right == null) return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if (right.right != null) {
                return false;
            }

            if (left.right != null) {
                if (right.left == null) return false;
                stack.push(left.right);
                stack.push(right.left);
            } else if (right.left != null) {
                return false;
            }
        }

        return true;
    }

    public boolean isSymmetric3(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        while(!left.isEmpty() && !right.isEmpty()) {
            TreeNode l = left.poll();
            TreeNode r = right.poll();

            if (l == null && r == null)
                continue;
            if (l == null || r == null)
                return false;

            if (l.val != r.val)
                return false;

            left.add(l.left);
            right.add(r.right);

            left.add(l.right);
            right.add(r.left);
        }

        if (left.isEmpty() && right.isEmpty())
            return true;
        else
            return false;
    }
}
