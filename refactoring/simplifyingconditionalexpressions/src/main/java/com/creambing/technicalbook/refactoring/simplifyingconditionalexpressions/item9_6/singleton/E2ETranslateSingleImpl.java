/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.singleton;

import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.Language;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.WordFormBean;
import com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6.interfacev1.Translateable;

/**
 * Class Name: E2ETranslateSingleImpl
 * Description: 英文to英文翻译 单例模式
 * 反射和序列化会对单例造成破坏，还需要添加相关代码
 * <p>
 * author: CreamBing
 * time: 2019-02-19 16:13
 * version: v1.0.0
 */
public class E2ETranslateSingleImpl implements Translateable {

    private static class SingletonHolder {
        private static final E2ETranslateSingleImpl INSTANCE = new E2ETranslateSingleImpl();
    }

    private E2ETranslateSingleImpl() {
    }

    public static E2ETranslateSingleImpl getInstance() {
        return E2ETranslateSingleImpl.SingletonHolder.INSTANCE;
    }

    @Override
    public String translate(String word) {
        return "英文to英文";
    }

    @Override
    public void translate(WordFormBean wordFormBean) {
        Language fromType = wordFormBean.getFromType();
        Language toType = wordFormBean.getToType();
        String val = wordFormBean.getValue();
        if (fromType == Language.ENGLISH && toType == Language.ENGLISH) {
            wordFormBean.setResult(translate(val));
        }
    }
}
