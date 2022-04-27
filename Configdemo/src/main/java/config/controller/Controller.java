package config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * CreateTime: 2022/4/19 20:13
 * @author: dxz
 */
@RestController
public class Controller {


    @Value("${testconfig}")
    private String testconfig;

    @Value("${testcommon}")
    private String testcommon;

    @GetMapping("/test")
    public String test() {
        return testconfig;
    }

    @GetMapping("/testcommon")
    public String testcommon(){
        return testcommon;
    }

    @Value("${redisip}")
    private String redisip;

    @GetMapping("/redisip")
    public String getRedisip(){
        return redisip;
    }

    @Value("${mqip}")
    private String mqip;

    @GetMapping("/mqip")
    public String mqip(){
        return mqip;
    }

}
