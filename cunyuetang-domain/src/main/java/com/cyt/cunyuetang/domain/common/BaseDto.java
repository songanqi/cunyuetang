package com.cyt.cunyuetang.domain.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDto implements Serializable{
    /**
     * 第几页
     */
    private Integer pageNum = 1;
    /**
     * 每页几条
     */
    private Integer pageSize = 10;
    /**
     *查询字段类别
     */
    private String conditionType;
    /**
     * 关键字搜索
     */
    private String keyWords;

    /**
     * token
     */
    private String managerToken;
}
