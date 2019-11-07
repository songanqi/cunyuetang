package com.cyt.cunyuetang.api.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyt.cunyuetang.common.util.ResponseResult;
import com.cyt.cunyuetang.domain.user.dto.UserDto;
import com.cyt.cunyuetang.sdk.user.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private IUserService userService;

    @PostMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "分页获取列表", notes = "分页获取列表")
    public ResponseResult selectUserList(@RequestBody UserDto userDto) {
        return userService.selectUserList(userDto);
    }
}
