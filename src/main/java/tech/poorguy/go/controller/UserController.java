package tech.poorguy.go.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tech.poorguy.go.entity.User;
import tech.poorguy.go.service.IUserService;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author poorguy
 * @since 2019-05-19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @ApiOperation("add a new user")
    @PostMapping("/one")
    public void saveOne(@RequestParam @NotNull String name, @RequestParam @NotNull String password) {
        User user=new User();
        user.setName(name).setPassword(password).setActiveTime(new Date()).setCreateTime(new Date());
        boolean result=userService.save(user);
        System.out.println(result);
    }

}

