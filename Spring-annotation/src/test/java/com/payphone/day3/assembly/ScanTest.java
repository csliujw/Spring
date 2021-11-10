package com.payphone.day3.assembly;


import com.payphone.day3.configuration.ioc.assembly.DefineFilterConfiguration;
import com.payphone.day3.configuration.ioc.assembly.IncludeConfiguration;
import com.payphone.day3.configuration.ioc.assembly.MainConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ScanTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(MainConfiguration.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(IncludeConfiguration.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }

    @Test
    public void test3() {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(DefineFilterConfiguration.class);
        String[] beanDefinitionNames = anno.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }
}
