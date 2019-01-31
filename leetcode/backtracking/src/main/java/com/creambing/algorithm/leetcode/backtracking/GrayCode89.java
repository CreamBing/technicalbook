/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Name: GrayCode89
 * Description: 格林编码
 * <p>
 * author: CreamBing
 * time: 2019-01-31 23:17
 * version: v1.0.0
 */
public class GrayCode89 {

    public static List<Integer> grayCode(int n) {
        List<Integer> code = new ArrayList<Integer>();
        code.add(0);
        genCodes(code, n, 0, 1 << n);
        return code;
    }

    private static void genCodes(List<Integer> code, int n, int curr, int size) {
        if (code.size() == size) return;
        for (int i = 0; i < n; i++) {
            int mask = 1 << i;
            int el = (curr ^ mask);
            if (!code.contains(el)) {
                code.add(el);
                genCodes(code, n, el, size);
                if (code.size() == size) return;
                code.remove(new Integer(el));
            }
        }
    }

    public static List<Integer> grayCode1(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args) {
        grayCode(2).forEach(System.out::println);
        grayCode1(2).forEach(System.out::println);
    }
}
