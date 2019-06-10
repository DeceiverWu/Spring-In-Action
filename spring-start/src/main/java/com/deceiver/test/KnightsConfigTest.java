package com.deceiver.test;

import com.deceiver.config.KnightConfig;
import com.deceiver.pojo.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-06
 * Time: 18:55
 */
public class KnightsConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = (Knight)ctx.getBean("knight");
        knight.embarkOnQuest();
    }
}
