/**
 * creambing.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */


package com.creambing.technicalbook.spring5.chone.bean;

import com.creambing.technicalbook.spring5.chone.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class Name:MessagePrinterBean
 * Description:消息打印类
 *
 * @author Bing
 * @create 2019-01-24  23:13
 * @version v1.0
 */
@Component
public class MessagePrinterBean {

    //@Autowired 因为是final修饰的，所以只能放在构造器上，还有一种情况是另一个属性初始化依赖autowired的属性，此时也只能放在构造器上
    final private MessageService messageService;

    @Autowired
    public MessagePrinterBean(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(messageService.getMessage());
    }
}
