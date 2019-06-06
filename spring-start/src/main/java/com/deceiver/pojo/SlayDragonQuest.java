package com.deceiver.pojo;

import java.io.PrintStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-06
 * Time: 16:34
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() throws QuestException {
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
