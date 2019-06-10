package com.deceiver.pojo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 16:11
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.deceiver.pojo+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
