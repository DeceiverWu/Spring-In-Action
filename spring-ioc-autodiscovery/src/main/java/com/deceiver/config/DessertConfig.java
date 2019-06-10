package com.deceiver.config;

import com.deceiver.pojo.Cake;
import com.deceiver.pojo.Cookie;
import com.deceiver.pojo.Dessert;
import com.deceiver.pojo.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 11:45
 */
@Configuration
public class DessertConfig {

    @Bean
    @Primary
    public Dessert cake() {
        return new Cake();
    }

    @Bean
    public Dessert cookie() {
        return new Cookie();
    }

    @Bean
    public Dessert iceCream() {
        return new IceCream();
    }

}
