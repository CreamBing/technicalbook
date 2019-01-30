/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3;

/**
 * Class Name: SingletonWithEnum
 * Description: 利用枚举类实现单例
 *
 * author: CreamBing
 * time: 2019-01-30 23:22
 * version: v1.0.0
 */
public enum  SingletonWithEnum {
    //枚举元素本身就是单例
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation(){
        System.out.println("complete singleton");
    }
}
