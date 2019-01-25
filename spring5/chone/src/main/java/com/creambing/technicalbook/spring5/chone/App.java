package com.creambing.technicalbook.spring5.chone;

import com.creambing.technicalbook.spring5.chone.bean.MessagePrinterBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        MessagePrinterBean messagePrinterBean = ctx.getBean(MessagePrinterBean.class);
        messagePrinterBean.printMessage();
    }
}
