/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item5;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.TranslateFactory;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.impl.C2CTranslateImpl;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton.C2CTranslateSingleImpl;
import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestTranslateFactory
 * Description: 测试TranslateFactory是否单例
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:29
 * version: v1.0.0
 */
public class TestTranslateFactory {

    @Test
    public void testIsNotSingleton() {
        Translateable translateable1 = TranslateFactory.create(C2CTranslateImpl::new);
        Translateable translateable2 = TranslateFactory.create(C2CTranslateImpl::new);
        assertNotSame("supplier.get new出来的对象是多例的", translateable1, translateable2);
    }

    @Test
    public void testIsSingleton() {
        Translateable translateable1 = TranslateFactory.create(C2CTranslateSingleImpl::getInstance);
        Translateable translateable2 = TranslateFactory.create(C2CTranslateSingleImpl::getInstance);
        assertThat("supplier.get 的对象是单例的话才是单例的", translateable1, sameInstance(translateable2));
    }
}
