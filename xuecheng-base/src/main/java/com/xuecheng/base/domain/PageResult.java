package com.xuecheng.base.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页查询结果
 */
@Data
@NoArgsConstructor
public class PageResult <T> extends PageParams{
    /**
     * 总数
     */
    private long total;

//    /**
//     * 当前数据量
//     */
//    private long size;

//    /**
//     * 当前页数
//     */
//    private long current;

    /**
     * 当前页数据
     */
    private List<T> records;

    public PageResult(long total, long size, long pages, List<T> records) {
        this.total = total;
        super.setSize(size);
        super.setPages(pages);
        this.records = records;
    }
}
