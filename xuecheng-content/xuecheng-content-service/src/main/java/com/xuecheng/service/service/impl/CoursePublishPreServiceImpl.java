package com.xuecheng.service.service.impl;

import com.xuecheng.service.service.CoursePublishPreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.service.mapper.CoursePublishPreMapper;
import com.xuecheng.model.domain.CoursePublishPreEntity;

/**
 * 课程发布Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CoursePublishPreServiceImpl extends ServiceImpl<CoursePublishPreMapper, CoursePublishPreEntity> implements CoursePublishPreService {
    @Autowired
    private CoursePublishPreMapper coursePublishPreMapper;

}
