package com.xuecheng.service.service.impl;

import com.xuecheng.service.service.CoursePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.service.mapper.CoursePublishMapper;
import com.xuecheng.model.domain.CoursePublishEntity;

/**
 * 课程发布Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CoursePublishServiceImpl extends ServiceImpl<CoursePublishMapper, CoursePublishEntity> implements CoursePublishService {
    @Autowired
    private CoursePublishMapper coursePublishMapper;

}
