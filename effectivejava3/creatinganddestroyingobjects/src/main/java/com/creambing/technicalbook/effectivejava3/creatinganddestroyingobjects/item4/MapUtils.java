/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item4;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Name: MapUtils
 * Description:
 * 通过私有构造器强化不可实例化的能力
 * Enforce noninstantiability with a private constructor
 * 使用范围：
 * 当需要编写只包含静态方法或者静态域的类时，例如 java.lang.Math java.uril.Arrays
 * 单例模式
 * 缺点：
 * 这个类不能被子类化，无法被继承
 *
 * author: CreamBing
 * time: 2019-01-30 13:58
 * version: v1.0.0
 */
public class MapUtils {

    //私有构造，表示这个类初始化没有意义
    private MapUtils() {
    }

    //在google guava类库中就有该工具方法，在方法类型推断还没有出来之前
    public static <K,V> Map<K,V> newHashMap(){
        return new HashMap<>();
    }
}
