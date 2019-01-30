/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item3;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item3.SingletonWithEnum;
import org.junit.Test;

/**
 * Class Name: TestSingletonWithEnum
 * Description: 
 *
 * author: CreamBing
 * time: 2019-01-30 23:51
 * version: v1.0.0
 */
public class TestSingletonWithEnum {

    private SingletonWithEnum singletonWithEnum = SingletonWithEnum.INSTANCE;

    @Test
    public void testSingletonOperation(){
        singletonWithEnum.singletonOperation();
    }
}
