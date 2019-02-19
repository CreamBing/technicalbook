/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package test.creatinganddestroyingobjects.item5;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.Language;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.WordFormBean;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Class Name: TestOptional
 * Description: 测试optional
 *
 * author: CreamBing
 * time: 2019-02-18 21:26
 * version: v1.0.0
 */
public class TestOptional {

    @Test
    public void testNPE(){
        WordFormBean wordFormBean1 = new WordFormBean();
        Optional<WordFormBean> wordFormBeanOpt1 = Optional.ofNullable(wordFormBean1).filter(w-> StringUtils.isNotBlank(w.getValue()));
        String val1 = wordFormBeanOpt1.map(WordFormBean::getValue).orElse(null);
        assertThat(val1,equalTo(null));
        WordFormBean wordFormBean2 = new WordFormBean();
        wordFormBean2.setValue("你好");
        wordFormBean2.setFromType(Language.CHINESE);
        Optional<WordFormBean> wordFormBeanOpt2 = Optional.ofNullable(wordFormBean2).
                filter(w-> StringUtils.isNotBlank(w.getValue())&&w.getFromType()!=null&&w.getToType()!=null);
        String val2 = wordFormBeanOpt2.map(WordFormBean::getValue).orElse(null);
        assertThat(val2,equalTo(null));
        WordFormBean wordFormBean3 = new WordFormBean();
        wordFormBean3.setValue("你好");
        wordFormBean3.setFromType(Language.CHINESE);
        wordFormBean3.setToType(Language.ENGLISH);
        Optional<WordFormBean> wordFormBeanOpt3 = Optional.ofNullable(wordFormBean3).
                filter(w-> StringUtils.isNotBlank(w.getValue())&&w.getFromType()!=null&&w.getToType()!=null);
        String val3 = wordFormBeanOpt3.map(WordFormBean::getValue).orElse(null);
        assertThat(val3,equalTo("你好"));
    }
}
