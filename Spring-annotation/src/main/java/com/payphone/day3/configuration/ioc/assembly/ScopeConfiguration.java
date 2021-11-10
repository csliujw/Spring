package com.payphone.day3.configuration.ioc.assembly;

import com.payphone.day3.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfiguration {

    @Scope("prototype")
    @Bean
    public Person person() {
        return new Person("asdf");
    }
}
