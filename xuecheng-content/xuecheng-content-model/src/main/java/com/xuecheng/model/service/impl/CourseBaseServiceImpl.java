package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.CourseBaseMapper;
import com.xuecheng.model.domain.CourseBaseEntity;
import com.xuecheng.model.service.CourseBaseService;

/**
 * 课程基本信息Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBaseEntity> implements CourseBaseService {
    @Autowired
    private CourseBaseMapper courseBaseMapper;

}
