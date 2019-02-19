/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Optional;

/**
 * Class Name: BadTranslationService
 * Description: 糟糕的翻译服务类
 * <p>
 * author: CreamBing
 * time: 2019-02-02 0:47
 * version: v1.0.0
 */
public class BadTranslationService {
    private static C2CService c2CService = new C2CService();
    private static C2EService c2EService = new C2EService();
    private static E2CService e2CService = new E2CService();
    private static E2EService e2EService = new E2EService();

    public static String translate(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        String val = wordFormBeanOpt.map(WordFormBean::getValue).orElse("");
        Language fromType = wordFormBeanOpt.map(WordFormBean::getFromType).orElse(Language.CHINESE);
        Language toType = wordFormBeanOpt.map(WordFormBean::getToType).orElse(Language.CHINESE);
        String translateWord = "";
        switch (fromType) {
            case CHINESE:
                translateWord = caseFunc(toType, c2CService.translate(val), c2EService.translate(val));
                break;
            case ENGLISH:
                translateWord = caseFunc(toType, e2CService.translate(val), e2EService.translate(val));
                break;
            default:
                throw new IllegalArgumentException("源语言不符合要求");
        }
        return translateWord;
    }

    private static String caseFunc(Language toType, String translate, String translate2) {
        String translateWord;
        switch (toType) {
            case CHINESE:
                translateWord = translate;
                break;
            case ENGLISH:
                translateWord = translate2;
                break;
            default:
                throw new IllegalArgumentException("目标翻译语言不符合要求");
        }
        return translateWord;
    }

}
