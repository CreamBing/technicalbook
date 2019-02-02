/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5;

import java.util.Objects;
import java.util.Optional;

/**
 * Class Name: BadTranslationService
 * Description: 糟糕的翻译服务类
 *
 * author: CreamBing
 * time: 2019-02-02 0:47
 * version: v1.0.0
 */
public class BadTranslationService {
    private C2CService c2CService = new C2CService();
    private C2EService c2EService = new C2EService();
    private E2CService e2CService = new E2CService();
    private E2EService e2EService = new E2EService();

    public static String translate(WordFormBean wordFormBean){
        Optional.ofNullable(wordFormBean).filter(w->!w.getValue().equals(""));
        //TODO java8 Optional为空判断
        return null;
    }


}
