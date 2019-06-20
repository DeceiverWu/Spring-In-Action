package com.deceiver.springbootjpa.repository;

import com.deceiver.springbootjpa.domain.Order;
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
