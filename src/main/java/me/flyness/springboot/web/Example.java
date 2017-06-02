package me.flyness.springboot.web;

import me.flyness.springboot.config.AmazonProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by bjlizhitao on 2017/2/23.
 * 示例
 */
@RestController
//@ConfigurationProperties(prefix = "amazon")
public class Example {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${app.name}")
    private String appName;
    @Value("${my.secret}")
    private String mySecret;

    @Resource
    private AmazonProperties amazonProperties;

    /*private String associateId;

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }*/

    @RequestMapping(path = "/")
    public String home() {
        logger.info("===================");
        logger.info(appName);
        logger.info(mySecret);
        logger.info(amazonProperties.getAssociateId());
        return "Hello World!";
    }
}
