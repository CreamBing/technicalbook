/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;

/**
 * Class Name: C2ETranslateSingleImpl
 * Description: 中文to英文翻译 单例
 * 反射和序列化会对单例造成破坏，还需要添加相关代码
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:13
 * version: v1.0.0
 */
public class C2ETranslateSingleImpl implements Translateable {

    private static class SingletonHolder {
        private static final C2ETranslateSingleImpl INSTANCE = new C2ETranslateSingleImpl();
    }

    private C2ETranslateSingleImpl() {
    }

    public static C2ETranslateSingleImpl getInstance() {
        return C2ETranslateSingleImpl.SingletonHolder.INSTANCE;
    }

    @Override
    public String translate(String word) {
        return "中文to英文";
    }
}
