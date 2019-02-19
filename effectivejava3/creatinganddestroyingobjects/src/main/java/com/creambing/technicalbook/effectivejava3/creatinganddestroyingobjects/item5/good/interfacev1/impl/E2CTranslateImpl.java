/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.impl;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;

/**
 * Class Name: E2CTranslateImpl
 * Description: 英文to中文翻译
 *
 * author: CreamBing
 * time: 2019-02-19 16:13
 * version: v1.0.0
 */
public class E2CTranslateImpl implements Translateable {
    
    @Override
    public String translate(String word) {
        return "英文to中文";
    }
}
