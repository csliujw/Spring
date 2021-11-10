package mocks;

import com.payphone.day2.config.SpringBean;
import com.payphone.day2.controller.Demo;
import com.payphone.day2.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringBean.class)
public class SpringTest {
    @Autowired
    UserService service;
    @Autowired
    Demo demo;

    @Test
    public void test1() {
        System.out.println(service);
        System.out.println(demo);
    }
}
