package com.deceiver.springbootjdbc.repository;

import com.deceiver.springbootjdbc.domain.Order;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-19
 * Time: 16:43
 */
public interface OrderRepository {

    Order save(Order order);
}
