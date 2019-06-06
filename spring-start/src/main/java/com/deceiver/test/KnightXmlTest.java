package com.deceiver.test;

import com.deceiver.pojo.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-06
 * Time: 17:15
 */
public class KnightXmlTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Knights.xml");
        Knight knight = (Knight) ctx.getBean("knight");
        knight.embarkOnQuest();
        ctx.close();
    }
}
