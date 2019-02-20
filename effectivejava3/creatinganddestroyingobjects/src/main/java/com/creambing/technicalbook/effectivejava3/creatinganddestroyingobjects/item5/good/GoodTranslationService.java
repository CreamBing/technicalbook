/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.Language;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.WordFormBean;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.enumv1.TranslateService;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.TranslateFactory;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

/**
 * Class Name: GoodTranslationService
 * Description: 比糟糕好一点的翻译服务类，可以对比枚举实现的 TranslateService
 * <p>
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

    public static String translateUsingEnum(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        String val = wordFormBeanOpt.map(WordFormBean::getValue).orElse("");
        Translateable translate = createByWordFormBeanUsingEnum(wordFormBean);
        return translate.translate(val);
    }

    private static Translateable getTranslateServiceUsingEnum(Language fromType, Language toType) {
        if (fromType == Language.CHINESE && toType == Language.CHINESE) {
            return TranslateService.C2CSERVICE;
        } else if (fromType == Language.CHINESE && toType == Language.ENGLISH) {
            return TranslateService.C2ESERVICE;
        } else if (fromType == Language.ENGLISH && toType == Language.CHINESE) {
            return TranslateService.E2CSERVICE;
        } else if (fromType == Language.ENGLISH && toType == Language.ENGLISH) {
            return TranslateService.E2ESERVICE;
        } else {
            throw new IllegalArgumentException("参数错误");
        }
    }

    private static Translateable createByWordFormBeanUsingEnum(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        Language fromType = wordFormBeanOpt.map(WordFormBean::getFromType).orElse(Language.CHINESE);
        Language toType = wordFormBeanOpt.map(WordFormBean::getToType).orElse(Language.CHINESE);
        return getTranslateServiceUsingEnum(fromType, toType);
    }
}
