package com.deceiver.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-10
 * Time: 12:00
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Notepad {
}
