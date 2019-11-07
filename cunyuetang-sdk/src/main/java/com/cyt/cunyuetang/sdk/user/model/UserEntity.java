package com.cyt.cunyuetang.sdk.user.model;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class UserEntity implements Serializable {
    @TableId
    private Long userId;

    private String userName;
}
