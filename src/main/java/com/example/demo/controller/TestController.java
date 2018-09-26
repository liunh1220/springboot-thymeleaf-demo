package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by liulanhua on 2018/9/25.
 */
@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value="",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) throws Exception {
        mv.addObject("record", "this is index page");
        mv.setViewName("index");
        return mv;
    }






}
