/**
 * https://creambing.github.io Inc.
 * Copyright(c)2018-2025 All Rights Reserved.
 */
package com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.enumv1;

import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.interfacev1.Translateable;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton.C2CTranslateSingleImpl;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton.C2ETranslateSingleImpl;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton.E2CTranslateSingleImpl;
import com.creambing.technicalbook.effectivejava3.creatinganddestroyingobjects.item5.good.singleton.E2ETranslateSingleImpl;

/**
 * Class Name: TranslateService
 * Description: 翻译枚举服务类
 * <p>
 * author: CreamBing
 * time: 2019-02-19 17:35
 * version: v1.0.0
 */
public enum TranslateService implements Translateable {
    C2CSERVICE(C2CTranslateSingleImpl.getInstance()) {
        @Override
        public String translate(String word) {
            return getTranslateable().translate(word);
        }
    }, C2ESERVICE(C2ETranslateSingleImpl.getInstance()) {
        @Override
        public String translate(String word) {
            return getTranslateable().translate(word);
        }
    }, E2ESERVICE(E2ETranslateSingleImpl.getInstance()) {
        @Override
        public String translate(String word) {
            return getTranslateable().translate(word);
        }
    }, E2CSERVICE(E2CTranslateSingleImpl.getInstance()) {
        @Override
        public String translate(String word) {
            return getTranslateable().translate(word);
        }
    };
    private final Translateable translateable;

    TranslateService(Translateable translateable) {
        this.translateable = translateable;
    }

    public Translateable getTranslateable() {
        return translateable;
    }
}
