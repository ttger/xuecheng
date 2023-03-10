package com.xuecheng.service.service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.model.domain.CourseCategoryEntity;

/**
 * 课程分类Service接口
 * 
 * @author zwh
 * @date 2023-03-07
 */
public interface CourseCategoryService extends IService<CourseCategoryEntity> {

    /**
     * 获取 课程分类 树结构，
     * @param id 为空则查询所有
     * @return List<CourseCategoryEntity>
     */
    List<CourseCategoryEntity> getTree(String id);

}
