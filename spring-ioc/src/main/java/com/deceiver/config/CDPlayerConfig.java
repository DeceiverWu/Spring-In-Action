package com.deceiver.config;

import com.deceiver.pojo.CDPlayer;
import com.deceiver.pojo.CompactDisc;
import com.deceiver.pojo.MediaPlayer;
import com.deceiver.pojo.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 09:56
 */
@Configuration
@ComponentScan(basePackages = {"com.deceiver.pojo"})
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
