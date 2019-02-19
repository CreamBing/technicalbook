/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.WordFormBean;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.TranslateFactory;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

/**
 * Class Name: GoodTranslationService
 * Description: 比糟糕好一点的翻译服务类，可以对比枚举实现的 TranslateService
 *
 * author: CreamBing
 * time: 2019-02-19 22:45
 * version: v1.0.0
 */
public class GoodTranslationService {

    public static String translate(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        String val = wordFormBeanOpt.map(WordFormBean::getValue).orElse("");
        Translateable translate = TranslateFactory.createByWordFormBean(wordFormBean);
        return translate.translate(val);
    }
}
