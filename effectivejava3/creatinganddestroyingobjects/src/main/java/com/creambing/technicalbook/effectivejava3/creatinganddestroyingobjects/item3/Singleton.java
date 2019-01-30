/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3;

/**
 * Class Name: Singleton
 * Description: 静态内部类实现的单例模式
 * <p>
 * author: CreamBing
 * time: 2019-01-31 0:14
 * version: v1.0.0
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
