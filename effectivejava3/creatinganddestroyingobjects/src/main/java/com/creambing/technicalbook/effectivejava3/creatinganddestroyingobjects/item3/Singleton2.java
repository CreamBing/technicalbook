/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Class Name: Singleton2
 * Description: 静态内部类实现的单例模式，解决序列化和反射漏洞
 * <p>
 * author: CreamBing
 * time: 2019-01-31 0:15
 * version: v1.0.0
 */
public class Singleton2 implements Serializable {

    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }

    private Singleton2() {
        // 防止反射获取多个对象的漏洞
        if (null != SingletonHolder.INSTANCE) {
            throw new RuntimeException("it is a Singleton");
        }
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.INSTANCE;
    }

}
