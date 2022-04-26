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

//    @Value("${test}")
//    private String testStr;

    @Value("${testconfig}")
    private String testconfig;

    @GetMapping("/test")
    public String test() {
        return testconfig;
    }
}
