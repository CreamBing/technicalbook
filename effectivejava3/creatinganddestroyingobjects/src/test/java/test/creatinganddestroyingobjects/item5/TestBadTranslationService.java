/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item5;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.BadTranslationService;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.Language;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.WordFormBean;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestBadTranslationService
 * Description: 测试糟糕翻译服务类
 * <p>
 * author: CreamBing
 * time: 2019-02-18 22:29
 * version: v1.0.0
 */
public class TestBadTranslationService {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testIllegalArgumentException() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("参数错误");
        WordFormBean wordFormBean = new WordFormBean();
        BadTranslationService.translate(wordFormBean);
    }

    @Test
    public void testIllegalArgumentException1() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("参数错误");
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        BadTranslationService.translate(wordFormBean);
    }

    @Test
    public void testSuccessC2E() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        wordFormBean.setToType(Language.ENGLISH);
        String val = BadTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("中文to英文"));
    }

    @Test
    public void testSuccessC2C() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        wordFormBean.setToType(Language.CHINESE);
        String val = BadTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("中文to中文"));
    }

    @Test
    public void testSuccessE2E() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("hello");
        wordFormBean.setFromType(Language.ENGLISH);
        wordFormBean.setToType(Language.ENGLISH);
        String val = BadTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("英文to英文"));
    }

    @Test
    public void testSuccessE2C() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("hello");
        wordFormBean.setFromType(Language.ENGLISH);
        wordFormBean.setToType(Language.CHINESE);
        String val = BadTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("英文to中文"));
    }

}
