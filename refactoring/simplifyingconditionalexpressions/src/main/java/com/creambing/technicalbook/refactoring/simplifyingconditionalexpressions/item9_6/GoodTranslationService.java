/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6;

import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.interfacev1.TranslateFactory;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.interfacev1.Translateable;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.singleton.C2CTranslateSingleImpl;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.singleton.C2ETranslateSingleImpl;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.singleton.E2CTranslateSingleImpl;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.singleton.E2ETranslateSingleImpl;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

/**
 * Class Name: GoodTranslationService
 * Description: 比糟糕好一点的翻译服务类，可以对比枚举实现的 TranslateService
 * 利用多态将条件分解隐藏，重构effectivejava3中的creating模块中的item5中的GoodTranslationService的getTranslateServiceUsingEnum方法
 * <p>
 * author: CreamBing
 * time: 2019-02-19 22:45
 * version: v1.0.0
 */
public class GoodTranslationService {


    /**
     * 这里利用多态将条件判断放在了子类实现中，同时扩展了接口，使得底层代码不够底层，在调用的时候多实现了类
     * @param wordFormBean
     * @return
     */
    public static String translate(WordFormBean wordFormBean) {
        Optional<WordFormBean> wordFormBeanOpt = Optional.ofNullable(wordFormBean).
                filter(w -> StringUtils.isNotBlank(w.getValue()) && w.getFromType() != null && w.getToType() != null);
        if (!wordFormBeanOpt.isPresent()) {
            throw new IllegalArgumentException("参数错误");
        }
        Translateable C2CSERVICE = TranslateFactory.create(C2CTranslateSingleImpl::getInstance);
        Translateable C2ESERVICE = TranslateFactory.create(C2ETranslateSingleImpl::getInstance);
        Translateable E2CSERVICE = TranslateFactory.create(E2CTranslateSingleImpl::getInstance);
        Translateable E2ESERVICE = TranslateFactory.create(E2ETranslateSingleImpl::getInstance);
        //这里可以用责任链模式
        C2CSERVICE.translate(wordFormBean);
        C2ESERVICE.translate(wordFormBean);
        E2CSERVICE.translate(wordFormBean);
        E2ESERVICE.translate(wordFormBean);
        if (StringUtils.isBlank(wordFormBean.getResult())) {
            throw new IllegalArgumentException("参数错误language:" + wordFormBean.getFromType() + "->" + wordFormBean.getToType());
        }
        return wordFormBean.getResult();
    }

}
