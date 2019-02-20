/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.refactoring.simplifyingconditionalexpressions.item9_6;

/**
 * Class Name: WordFormBean
 * Description: 需要翻译的单词bean
 * <p>
 * author: CreamBing
 * time: 2019-02-02 0:33
 * version: v1.0.0
 */
public class WordFormBean {

    //单词的内容
    private String value;
    //单词是何种语言
    private Language fromType;
    //单词需要翻译成何种语言
    private Language toType;
    //翻译后的结果
    private String result;

    public WordFormBean() {
    }

    public WordFormBean(String value, Language fromType, Language toType) {
        this.value = value;
        this.fromType = fromType;
        this.toType = toType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Language getFromType() {
        return fromType;
    }

    public void setFromType(Language fromType) {
        this.fromType = fromType;
    }

    public Language getToType() {
        return toType;
    }

    public void setToType(Language toType) {
        this.toType = toType;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
