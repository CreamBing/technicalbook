/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3;

/**
 * Class Name: MySingletonImpl
 * Description: 利用枚举类实现接口和单例
 * <p>
 * author: CreamBing
 * time: 2019-01-30 23:42
 * version: v1.0.0
 */
public enum MySingletonImpl implements MySingleton {
    INSTANCE;

    @Override
    public void doSomething() {
        System.out.println("complete singleton");
    }

    public static MySingleton getInstance() {
        return MySingletonImpl.INSTANCE;
    }
}
