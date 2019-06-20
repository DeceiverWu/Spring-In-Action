package com.deceiver.springbootsecurity.repository;


import com.deceiver.springbootsecurity.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 01:03
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
