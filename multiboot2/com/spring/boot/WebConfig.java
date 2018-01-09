package com.spring.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jianhao on 2018/1/8.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.boot")
public class WebConfig extends WebMvcConfigurerAdapter{


}
