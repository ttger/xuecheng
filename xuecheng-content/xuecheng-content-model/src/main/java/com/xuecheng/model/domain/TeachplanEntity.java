package com.xuecheng.model.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 课程计划对象 teachplan
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
public class TeachplanEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 课程计划名称 */
    private String pname;

    /** 课程计划父级Id */
    private Long parentid;

    /** 层级，分为1、2、3级 */
    private Integer grade;

    /** 课程类型:1视频、2文档 */
    private String mediaType;

    /** 开始直播时间 */
    private Date startTime;

    /** 直播结束时间 */
    private Date endTime;

    /** 章节及课程时介绍 */
    private String description;

    /** 时长，单位时:分:秒 */
    private String timelength;

    /** 排序字段 */
    private Long orderby;

    /** 课程标识 */
    private Long courseId;

    /** 课程发布标识 */
    private Long coursePubId;

    /** 状态（1正常  0删除） */
    private Long status;

    /** 是否支持试学或预览（试看） */
    private String isPreview;

    /** 创建时间 */
    private Date createDate;

    /** 修改时间 */
    private Date changeDate;


}
