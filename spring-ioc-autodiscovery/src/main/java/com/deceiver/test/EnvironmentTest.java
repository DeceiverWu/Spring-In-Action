package com.deceiver.test;

import com.deceiver.config.ExpressiveConfig;
import com.deceiver.pojo.BlankDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 14:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ExpressiveConfig.class})
public class EnvironmentTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void testPropertySource() {
        blankDisc.play();
        Assert.assertNotNull(blankDisc);
    }

}
