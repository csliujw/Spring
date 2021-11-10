package com.payphone.day3.configuration.ioc.assembly;

import com.payphone.day3.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class LazyConfiguration {
    @Scope("prototype")
    @Bean
    @Lazy
    public Person person() {
        System.out.println("Create Person");
        return new Person();
    }

    @Bean
    public Person getP() {
        System.out.println("Create getP");
        return new Person();
    }
}
