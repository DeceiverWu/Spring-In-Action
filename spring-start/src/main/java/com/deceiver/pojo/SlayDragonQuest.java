package com.deceiver.pojo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-06
 * Time: 16:34
 */
public class SlayDragonQuest implements Quest {

    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }
}
