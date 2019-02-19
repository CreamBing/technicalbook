/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item5;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.enumv1.TranslateService;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestTranslateService
 * Description: 测试TranslateService枚举
 * <p>
 * author: CreamBing
 * time: 2019-02-19 21:17
 * version: v1.0.0
 */
public class TestTranslateService {

    TranslateService C2CSERVICE = TranslateService.C2CSERVICE;
    TranslateService C2ESERVICE = TranslateService.C2ESERVICE;
    TranslateService E2ESERVICE = TranslateService.E2ESERVICE;
    TranslateService E2CSERVICE = TranslateService.E2CSERVICE;

    @Test
    public void testSingleon(){
        TranslateService C2C1 = TranslateService.C2CSERVICE;
        assertThat("枚举实例是单例的",C2CSERVICE,sameInstance(C2C1));
    }

    @Test
    public void testC2CSERVICE() {
        assertThat(C2CSERVICE.translate("你好"), equalTo("中文to中文"));
    }

    @Test
    public void testC2ESERVICE() {
        assertThat(C2ESERVICE.translate("你好"), equalTo("中文to英文"));
    }

    @Test
    public void testE2ESERVICE() {
        assertThat(E2ESERVICE.translate("hello"), equalTo("英文to英文"));
    }

    @Test
    public void testE2CSERVICE() {
        assertThat(E2CSERVICE.translate("hello"), equalTo("英文to中文"));
    }

}
