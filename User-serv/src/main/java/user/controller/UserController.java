package user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * CreateTime: 2022/4/11 20:00
 * @author: dxz
 */
@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public String getUserName(@PathVariable("userId") Integer userId) {
        return "PlanMak1r";
    }
}
