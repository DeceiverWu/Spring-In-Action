package com.deceiver.springbootautoconfiguration.repository;

import com.deceiver.springbootautoconfiguration.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 11:34
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
