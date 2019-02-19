/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item5;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.Language;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.WordFormBean;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.GoodTranslationService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestGoodTranslationService
 * Description: 测试TestGoodTranslationService
 *
 * author: CreamBing
 * time: 2019-02-19 22:50
 * version: v1.0.0
 */
public class TestGoodTranslationService {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testIllegalArgumentException() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("参数错误");
        WordFormBean wordFormBean = new WordFormBean();
        GoodTranslationService.translate(wordFormBean);
    }

    @Test
    public void testIllegalArgumentException1() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("参数错误");
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        GoodTranslationService.translate(wordFormBean);
    }

    @Test
    public void testSuccessC2E() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        wordFormBean.setToType(Language.ENGLISH);
        String val = GoodTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("中文to英文"));
    }

    @Test
    public void testSuccessC2C() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("你好");
        wordFormBean.setFromType(Language.CHINESE);
        wordFormBean.setToType(Language.CHINESE);
        String val = GoodTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("中文to中文"));
    }

    @Test
    public void testSuccessE2E() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("hello");
        wordFormBean.setFromType(Language.ENGLISH);
        wordFormBean.setToType(Language.ENGLISH);
        String val = GoodTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("英文to英文"));
    }

    @Test
    public void testSuccessE2C() {
        WordFormBean wordFormBean = new WordFormBean();
        wordFormBean.setValue("hello");
        wordFormBean.setFromType(Language.ENGLISH);
        wordFormBean.setToType(Language.CHINESE);
        String val = GoodTranslationService.translate(wordFormBean);
        assertThat(val, equalTo("英文to中文"));
    }
}
