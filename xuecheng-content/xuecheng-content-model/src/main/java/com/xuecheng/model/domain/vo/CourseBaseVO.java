package com.xuecheng.model.domain.vo;

import com.xuecheng.base.config.custom;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 课程基本信息对象 course_base
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
@Validated
public class CourseBaseVO implements Serializable{
    private static final long serialVersionUID = 1L;


    /** 机构ID */
    private Long companyId;

    /** 机构名称 */
    @NotEmpty(message = "机构名称不能为空")
    private String companyName;

    /** 课程名称 */
    @NotEmpty(message = "课程名称不能为空")
    @Size(message = "不能超过20字", max = 20)
    private String name;

    /** 适用人群 */
    @custom(message = "自定义验证", min = 10, max = 20)
    private String users;

    /** 课程标签 */
    private String tags;

    /** 大分类 */
    private String mt;

    /** 小分类 */
    private String st;

    /** 课程等级 */
    private String grade;

    /** 教育模式(common普通，record 录播，live直播等） */
    private String teachmode;

    /** 课程介绍 */
    private String description;

    /** 课程图片 */
    private String pic;

}
