/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;

/**
 * Class Name: E2ETranslateSingleImpl
 * Description: 英文to英文翻译 单例模式
 * 反射和序列化会对单例造成破坏，还需要添加相关代码
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:13
 * version: v1.0.0
 */
public class E2ETranslateSingleImpl implements Translateable {

    private static class SingletonHolder {
        private static final E2ETranslateSingleImpl INSTANCE = new E2ETranslateSingleImpl();
    }

    private E2ETranslateSingleImpl() {
    }

    public static E2ETranslateSingleImpl getInstance() {
        return E2ETranslateSingleImpl.SingletonHolder.INSTANCE;
    }

    @Override
    public String translate(String word) {
        return "英文to英文";
    }
}
