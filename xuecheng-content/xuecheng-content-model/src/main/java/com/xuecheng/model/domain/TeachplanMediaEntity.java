package com.xuecheng.model.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 【请填写功能名称】对象 teachplan_media
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@TableName("teachplan_media")
public class TeachplanMediaEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 媒资文件id */
    private String mediaId;

    /** 课程计划标识 */
    private Long teachplanId;

    /** 课程标识 */
    private Long courseId;

    /** 媒资文件原始名称 */
    private String mediaFilename;

    /** $column.columnComment */
    private Date createDate;

    /** 创建人 */
    private String createPeople;

    /** 修改人 */
    private String changePeople;


}
