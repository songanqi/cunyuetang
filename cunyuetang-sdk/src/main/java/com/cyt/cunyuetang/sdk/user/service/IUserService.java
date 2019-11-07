package com.cyt.cunyuetang.sdk.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.cyt.cunyuetang.common.util.ResponseResult;
import com.cyt.cunyuetang.domain.user.dto.UserDto;
import com.cyt.cunyuetang.sdk.user.model.UserEntity;

public interface IUserService extends IService<UserEntity> {
    ResponseResult selectUserList(UserDto userDto);
}
