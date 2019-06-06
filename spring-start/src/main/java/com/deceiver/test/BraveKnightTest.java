package com.deceiver.test;

import com.deceiver.pojo.BraveKnight;
import com.deceiver.pojo.Quest;
import com.deceiver.pojo.RescueDamselQuest;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-06
 * Time: 16:29
 */
public class BraveKnightTest {

    @Test
    public void braveKnightEmbarkOnQuest() {
        Quest quest = new RescueDamselQuest();
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
    }
}
