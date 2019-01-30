/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.algorithm.leetcode.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class Name: PermutationSequence60
 * Description: 输出第k个全排列
 * <p>
 * author: CreamBing
 * time: 2019-01-30 20:52
 * version: v1.0.0
 */
public class PermutationSequence60 {
    // 8 ms
    public String getPermutation(int n, int k) {
        LinkedList<Integer> notUsed = new LinkedList<Integer>();
        int weight = 1;
        for (int i = 1; i <= n; i++) {
            notUsed.add(i);
            if (i == n)
                break;
            weight = weight * i;
        }
        String res = "";
        k = k - 1;
        while (true) {
            res = res + notUsed.remove(k / weight);
            k = k % weight;
            if (notUsed.isEmpty())
                break;
            weight = weight / notUsed.size();
        }
        return res;
    }

    //	1276 ms
    public String getPermutation1(int n, int k) {
        char[] arr = getArray(n);
        List<String> result = new ArrayList<>();
        backtracking(result,0,arr);
        result.sort(String::compareTo);
        return result.get(k-1);
    }

    private void backtracking(List<String> result,int n,char[] arr){
        if(n==arr.length-1){
            result.add(new String(arr));
        }else {
            for(int i=n,m=arr.length;i<m;i++){
                swap(arr,i,n);
                backtracking(result,n+1,arr);
                swap(arr,i,n);
            }
        }
    }

    private void swap(char[] arr,int i,int j){
        char swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    private char[] getArray(int n) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            //将1转为'1',ascii码值恰好相差48
            arr[i] = (char)((i + 1)+48);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new PermutationSequence60().getPermutation(4, 13));
        System.out.println(new PermutationSequence60().getPermutation1(4, 13));
    }
}
