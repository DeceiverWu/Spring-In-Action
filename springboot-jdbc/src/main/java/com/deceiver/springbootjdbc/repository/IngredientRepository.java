package com.deceiver.springbootjdbc.repository;

import com.deceiver.springbootjdbc.domain.Ingredient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-19
 * Time: 10:58
 */
public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
