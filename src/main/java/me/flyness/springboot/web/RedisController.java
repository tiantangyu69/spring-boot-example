package me.flyness.springboot.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by bjlizhitao on 2017/6/2.
 */
@RestController
@EnableAutoConfiguration
public class RedisController {
    @Resource
    private RedisTemplate<String, String> redis;


    @RequestMapping("/redis/set/key/{key}/value/{value}")
    public String redisSet(@PathVariable(name = "key") String key, @PathVariable(name = "value") String value) {
        redis.opsForValue().set(key, value);

        return "ok";
    }

    @RequestMapping("/redis/get/key/{key}")
    public String redisGet(@PathVariable(name = "key") String key) {
        return redis.opsForValue().get(key);
    }
}
