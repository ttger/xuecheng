package com.xuecheng.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.model.domain.CourseBaseEntity;
import com.xuecheng.model.domain.vo.CourseQueryVo;
import com.xuecheng.base.domain.PageParams;
import com.xuecheng.base.utils.CommonResult;

/**
 * 课程基本信息Service接口
 * 
 * @author zwh
 * @date 2023-03-07
 */
public interface CourseBaseService extends IService<CourseBaseEntity> {

    /**
     * 按条件 分页查询。
     * @param pageParams pageParams
     * @param courseQueryVo courseQueryVo
     * @return PageResult
     */
    CommonResult selectList(PageParams pageParams, CourseQueryVo courseQueryVo);
}
