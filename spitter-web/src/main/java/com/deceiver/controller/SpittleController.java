package com.deceiver.controller;

import com.deceiver.pojo.Spittle;
import com.deceiver.service.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-11
 * Time: 10:37
 */
@Controller
@RequestMapping("/spitter")
public class SpittleController {

    @Autowired
    private SpittleRepository spittleRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam("max") long max, @RequestParam("count") int count) {
        return spittleRepository.findSpittles(max, count);
    }

    //@RequestMapping(value = "/{spittleId}")
    //public List<Spittle> getSpittleById(@PathVariable("spittleId") int spottleId) {
    //
    //}

}
