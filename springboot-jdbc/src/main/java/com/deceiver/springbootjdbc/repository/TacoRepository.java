package com.deceiver.springbootjdbc.repository;

import com.deceiver.springbootjdbc.domain.Taco;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-19
 * Time: 16:42
 */
public interface TacoRepository {

    Taco save(Taco taco);
}
