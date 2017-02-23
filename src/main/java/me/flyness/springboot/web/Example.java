package me.flyness.springboot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bjlizhitao on 2017/2/23.
 * 示例
 */
@RestController
@EnableAutoConfiguration
public class Example {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(path = "/")
    public String home() {
        logger.info("===================");
        return "Hello World!";
    }
}
