package com.cyt.cunyuetang.service.modules.user.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cyt.cunyuetang.domain.user.dto.UserDto;
import com.cyt.cunyuetang.sdk.user.model.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<UserEntity> {
    List<UserEntity> selectUserList(UserDto userDto);
}
