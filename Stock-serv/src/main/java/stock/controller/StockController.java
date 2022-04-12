package stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * CreateTime: 2022/4/11 20:15
 * @author: dxz
 */
@RestController
public class StockController {

    @GetMapping("/stock/reduce/{productId}")
    public String reduct(@PathVariable("productId") Integer productId) {
        System.out.println("减库存1个成功");
        return "减库存1个成功";
    }
}
