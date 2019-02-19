/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1;

/**
 * Class Name: Translateable
 * Description: 翻译接口
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:10
 * version: v1.0.0
 */
public interface Translateable {

    /**
     * 翻译抽象方法
     * 将一个单词翻译成相关语言
     *
     * @param word
     * @return
     */
    String translate(String word);
}
