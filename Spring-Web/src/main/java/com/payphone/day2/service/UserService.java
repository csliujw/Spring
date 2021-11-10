package com.payphone.day2.service;

import com.payphone.day2.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User findById() {
        return new User("ljw", 17, "nanchang");
    }
}
