package com.deceiver.springbootautoconfiguration.repository;

import com.deceiver.springbootautoconfiguration.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 00:59
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
