package com.payphone.day3.configuration.ioc.assign;

import com.payphone.day3.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValueConfig {
    @Bean
    public Person person() {
        return new Person();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfig.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
