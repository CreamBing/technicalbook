/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Name: LetterCasePermutation784
 * Description: 字母大小写全排列
 *
 * author: CreamBing
 * time: 2019-01-07 17:23
 * version: v1.0.0
 */
public class LetterCasePermutation784 {

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
//        backtrack(result, S.toCharArray(),0);
        letterCasePermutationUtil(S.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(List<String> res, char[] ch, int i) {
        if (i == ch.length) {
            res.add(new String(ch));
            return;
        }
        backtrack(res, ch, i  + 1);
        if (!Character.isLetter(ch[i])) return;
        ch[i] = Character.isLowerCase(ch[i]) ? Character.toUpperCase(ch[i]) : Character.toLowerCase(ch[i]);
        backtrack(res, ch, i + 1);
    }

    private void letterCasePermutationUtil(char[] s, int pos, List<String> result) {
        result.add(new String(s));
        for (int j = pos; j < s.length; j++) {
            char ch = s[j];
            if (Character.isAlphabetic(ch)) {
                s[j] = flip(ch);
                letterCasePermutationUtil(s, j+1, result);
                s[j]= ch;
            }
        }
    }

    private char flip(char ch){
        return Character.isUpperCase(ch)? Character.toLowerCase(ch):Character.toUpperCase(ch);
    }

    public static void main(String[] args) {
        String s = "abc";
        new LetterCasePermutation784().letterCasePermutation(s).forEach(System.out::println);
    }
}
