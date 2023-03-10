package com.xuecheng.model.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 【请填写功能名称】对象 course_audit
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@TableName("course_audit")
public class CourseAuditEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 课程id */
    private Long courseId;

    /** 审核意见 */
    private String auditMind;

    /** 审核状态 */
    private String auditStatus;

    /** 审核人 */
    private String auditPeople;

    /** 审核时间 */
    private Date auditDate;


}
