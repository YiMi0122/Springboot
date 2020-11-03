package com.atguigu.gmalllogger.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zljz
 * @create 2020-11-03 20:08
 */
//@Controller
    @RestController
    @Log4j
public class LoggerController {
    @RequestMapping("test1")
   // @ResponseBody
    public String test(@RequestParam("name") String nn,
                       @RequestParam("age") int age){
        System.out.println(nn + ":"+ age);
        return "success";
    }
    @RequestMapping("log")
    public String test2(@RequestParam("logString") String ss){
       // System.out.println(ss);
        log.info( ss );
        return "success";
    }
}
