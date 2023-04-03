package com.xuecheng.base.domain;

import lombok.Data;

/**
 * 分页参数
 */
@Data
public class PageParams {
    /**
     * 页码
     */
    private Long pages;

    /**
     * 每页大小
     */
    private Long size;
}
