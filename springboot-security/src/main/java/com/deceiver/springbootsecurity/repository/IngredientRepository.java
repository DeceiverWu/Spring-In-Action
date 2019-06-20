package com.deceiver.springbootsecurity.repository;

import com.deceiver.springbootsecurity.domain.Ingredient;
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
