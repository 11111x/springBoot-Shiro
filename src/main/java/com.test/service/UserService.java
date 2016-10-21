package com.test.service;

import com.test.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by cdyoue on 2016/10/21.
 */

public interface UserService {
    public User findByUserName(String userName);
}
