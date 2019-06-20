package com.deceiver.springbootautoconfiguration.utils;

import com.deceiver.springbootautoconfiguration.domain.Ingredient;
import com.deceiver.springbootautoconfiguration.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 17:16
 */
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        Optional<Ingredient> ingredientOption = ingredientRepository.findById(id);
        return ingredientOption.isPresent() ? ingredientOption.get() : null;
    }
}
