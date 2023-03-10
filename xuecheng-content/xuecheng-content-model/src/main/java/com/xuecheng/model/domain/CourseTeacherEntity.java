package com.xuecheng.model.domain;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import lombok.Data;

/**
 * 课程-教师关系对象 course_teacher
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@TableName("course_teacher")
public class CourseTeacherEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 课程标识 */
    private Long courseId;

    /** 教师标识 */
    private String teacherName;

    /** 教师职位 */
    private String position;

    /** 教师简介 */
    private String introduction;

    /** 照片 */
    private String photograph;

    /** 创建时间 */
    private Date createDate;


}
