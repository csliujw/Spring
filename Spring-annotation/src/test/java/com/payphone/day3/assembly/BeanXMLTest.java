package com.payphone.day3.assembly;


import com.payphone.day3.configuration.ioc.assembly.MainConfiguration;
import com.payphone.day3.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanXMLTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MainConfiguration.class);
        String[] beanNamesForType = context2.getBeanNamesForType(Person.class);
        String[] beanDefinitionNames = context2.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
        System.out.println("===========");
        for (int i = 0; i < beanNamesForType.length; i++) {
            System.out.println(beanNamesForType[i]);
        }
    }
}
