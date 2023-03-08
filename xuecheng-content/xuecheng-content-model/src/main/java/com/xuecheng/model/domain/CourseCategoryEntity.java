package com.xuecheng.model.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * 课程分类对象 course_category
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Data
public class CourseCategoryEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 分类名称 */
    private String name;

    /** 分类标签默认和名称一样 */
    private String label;

    /** 父结点id（第一级的父节点是0，自关联字段id） */
    private String parentid;

    /** 是否显示 */
    private Integer isShow;

    /** 排序字段 */
    private Long orderby;

    /** 是否叶子 */
    private Integer isLeaf;


}
