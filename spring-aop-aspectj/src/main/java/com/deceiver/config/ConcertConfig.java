package com.deceiver.config;

import com.deceiver.pojo.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 16:04
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.deceiver.pojo"})
public class ConcertConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }
}
