package com.ibeifeng.dubbo.consumer.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibeifeng.dubbo.service.IPersonService;

/**
 * Hello world!
 *
 */
public class App {
    
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "config/mvc/dubbo-consumer.xml" });
        context.start();
        IPersonService userService=(IPersonService) context.getBean("personService");
        System.out.println(userService.sayHello("lucy"));
        System.out.println(userService.findUserById(0));
    }
}
