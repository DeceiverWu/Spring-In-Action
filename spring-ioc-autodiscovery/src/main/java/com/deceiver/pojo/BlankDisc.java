package com.deceiver.pojo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 10:53
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
