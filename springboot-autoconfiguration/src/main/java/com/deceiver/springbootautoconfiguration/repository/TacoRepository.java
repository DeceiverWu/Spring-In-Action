package com.deceiver.springbootautoconfiguration.repository;

import com.deceiver.springbootautoconfiguration.domain.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 01:00
 */
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
