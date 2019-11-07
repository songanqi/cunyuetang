package com.cyt.cunyuetang.domain.user.dto;

import com.cyt.cunyuetang.domain.common.BaseDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto extends BaseDto implements Serializable {
    private String userName;
}
