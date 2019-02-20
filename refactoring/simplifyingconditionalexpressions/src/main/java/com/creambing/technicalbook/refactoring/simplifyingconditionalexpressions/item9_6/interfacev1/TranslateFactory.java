/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.interfacev1;

import java.util.function.Supplier;

/**
 * Class Name: TranslateFactory
 * Description: 翻译工厂
 * 原来的getTranslateService中用了大量的if else if语句，现在利用多态隐藏到子类实现中
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:25
 * version: v1.0.0
 */
public interface TranslateFactory {

    /**
     * 返回翻译服务类
     * 可惜supplier.get()返回的是多实例的，并不是单例的,这要看调用的对象是否是单例
     * 由于Translateable的实现类只有方法,没有域，相当于工具类，因此最好返回单例
     *
     * @param supplier
     * @return
     */
    static Translateable create(Supplier<Translateable> supplier) {
        return supplier.get();
    }

/*
    static Translateable getTranslateService(Language fromType, Language toType) {
        if (fromType == Language.CHINESE && toType == Language.CHINESE) {
            return create(C2CTranslateSingleImpl::getInstance);
        } else if (fromType == Language.CHINESE && toType == Language.ENGLISH) {
            return create(C2ETranslateSingleImpl::getInstance);
        } else if (fromType == Language.ENGLISH && toType == Language.CHINESE) {
            return create(E2CTranslateSingleImpl::getInstance);
        } else if (fromType == Language.ENGLISH && toType == Language.ENGLISH) {
            return create(E2ETranslateSingleImpl::getInstance);
        } else {
            throw new IllegalArgumentException("参数错误");
        }
    }
    */
/*
    static Translateable createByWordFormBean(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        Language fromType = wordFormBeanOpt.map(WordFormBean::getFromType).orElse(Language.CHINESE);
        Language toType = wordFormBeanOpt.map(WordFormBean::getToType).orElse(Language.CHINESE);
        return getTranslateService(fromType, toType);
    }
    */

}
