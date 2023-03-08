package com.xuecheng.model.domain;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;

/**
 * 课程营销信息对象 course_market
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
public class CourseMarketEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 主键，课程id */
    private Long id;

    /** 收费规则，对应数据字典 */
    private String charge;

    /** 现价 */
    private BigDecimal price;

    /** 原价 */
    private BigDecimal originalPrice;

    /** 咨询qq */
    private String qq;

    /** 微信 */
    private String wechat;

    /** 电话 */
    private String phone;

    /** 有效期天数 */
    private Long validDays;


}
