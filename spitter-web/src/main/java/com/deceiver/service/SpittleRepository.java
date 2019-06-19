package com.deceiver.service;

import com.deceiver.pojo.Spitter;
import com.deceiver.pojo.Spittle;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-11
 * Time: 09:58
 */
public interface SpittleRepository {

    List<Spittle> getRecentSpittles(int count);

    void saveSpittle(Spittle spittle);

    void saveSpitter(Spitter spitter);

    Spitter getSpitter(long id);

    void startFollowing(Spitter follower, Spitter followee);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    List<Spittle> getSpittlesForSpitter(String username);

    Spitter getSpitter(String username);

    Spittle getSpittleById(long id);

    void deleteSpittle(long id);
}
