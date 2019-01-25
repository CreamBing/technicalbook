/**
 * creambing.com Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */


package com.creambing.technicalbook.spring5.chone.service.impl;

import com.creambing.technicalbook.spring5.chone.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * Class Name:MessageServiceImpl
 * Description:消息服务实现类
 *
 * @author Bing
 * @create 2019-01-24  23:03
 * @version v1.0
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "hello world!";
    }
}
