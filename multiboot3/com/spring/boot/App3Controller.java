package com.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianhao on 2018/1/8.
 */
@RestController
public class App3Controller {
    @RequestMapping("/hello")
    public String hello(){
        return "mic hello";
    }
}
