package com.payphone.day3.configuration.ioc.assembly;

import com.payphone.day3.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Color.class, Friend.class})
public class ImportConfiguration {

    @Bean
    public Person person() {
        return new Person();
    }
}

class Color {
}

class Friend {
}

class Other {

}