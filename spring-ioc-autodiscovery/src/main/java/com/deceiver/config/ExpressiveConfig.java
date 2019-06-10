package com.deceiver.config;

import com.deceiver.pojo.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 13:59
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment env;

    @Bean
    public BlankDisc blankDisc() {
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist")
        );
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
