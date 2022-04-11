package shop.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 * CreateTime: 2022/4/11 20:30
 * @author: dxz
 */
@RestController
public class ShopCartController {
    @GetMapping("/shopcart/remove")
    public String remove(Integer productId,Integer userId) {
        return "移出购物车成功";
    }
}
