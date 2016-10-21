package com.test.repository;

import com.test.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cdyoue on 2016/10/21.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserName(String username);
}
