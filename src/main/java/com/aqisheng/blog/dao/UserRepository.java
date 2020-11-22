package com.aqisheng.blog.dao;

import com.aqisheng.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String user,String password);
}
