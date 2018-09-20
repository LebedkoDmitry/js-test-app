package com.tsystems;

import com.tsystems.annotated.service.AnnotatedService;
import com.tsystems.service.SimpleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:application-context-config.xml"
        );

        SimpleService simpleService = applicationContext.getBean(SimpleService.class);

        System.out.println(simpleService.getHelloMessage());

        applicationContext.close();

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext("com.tsystems.annotated");

        AnnotatedService annotatedService = applicationContext1.getBean(AnnotatedService.class);

        System.out.println(annotatedService.sayHello());

    }
}
