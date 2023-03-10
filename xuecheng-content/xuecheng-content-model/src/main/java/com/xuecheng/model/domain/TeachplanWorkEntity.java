package com.xuecheng.model.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 【请填写功能名称】对象 teachplan_work
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@TableName("teachplan_work")
public class TeachplanWorkEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 作业信息标识 */
    private Long workId;

    /** 作业标题 */
    private String workTitle;

    /** 课程计划标识 */
    private Long teachplanId;

    /** 课程标识 */
    private Long courseId;

    /** $column.columnComment */
    private Date createDate;

    /** $column.columnComment */
    private Long coursePubId;


}
