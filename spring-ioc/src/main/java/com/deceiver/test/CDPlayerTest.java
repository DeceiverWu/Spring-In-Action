package com.deceiver.test;

import com.deceiver.config.CDPlayerConfig;
import com.deceiver.pojo.CompactDisc;
import com.deceiver.pojo.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 10:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        Assert.assertNotNull(player);
    }
}
