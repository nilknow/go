package tech.poorguy.go.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author poorguy.tech
 * @Date 2019/5/29 13:09
 * @Mail 494939649@qq.com / maxwangein@gmail.com
 **/
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "article-write";
    }
}
