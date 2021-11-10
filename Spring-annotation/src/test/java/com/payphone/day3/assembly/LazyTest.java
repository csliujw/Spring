package com.payphone.day3.assembly;

import com.payphone.day3.configuration.ioc.assembly.LazyConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LazyConfiguration.class)

public class LazyTest {


    @Test
    public void test1() {
    }
}
