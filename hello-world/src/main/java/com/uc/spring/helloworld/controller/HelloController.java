package com.uc.spring.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: uc
 * Date: 2018-04-13
 * Time: 15:44
 * Desc:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/echo")
    public String echo(@RequestParam("msg") String msg) {
        return String.format("msg = %s", msg);
    }
}
