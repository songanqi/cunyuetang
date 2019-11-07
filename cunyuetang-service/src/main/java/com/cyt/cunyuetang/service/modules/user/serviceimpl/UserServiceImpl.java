package com.cyt.cunyuetang.service.modules.user.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cyt.cunyuetang.common.util.PageUtils;
import com.cyt.cunyuetang.common.util.ResponseResult;
import com.cyt.cunyuetang.domain.user.dto.UserDto;
import com.cyt.cunyuetang.sdk.user.model.UserEntity;
import com.cyt.cunyuetang.sdk.user.service.IUserService;
import com.cyt.cunyuetang.service.modules.user.dao.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
    @Override
    public ResponseResult selectUserList(UserDto userDto) {
        PageHelper.startPage(userDto.getPageNum(), userDto.getPageSize());
        List<UserEntity> list = baseMapper.selectUserList(userDto);

        PageInfo<UserEntity> pageInfo = new PageInfo<>(list);
        return ResponseResult.ok().put("page", new PageUtils(list, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum()));
    }
}
