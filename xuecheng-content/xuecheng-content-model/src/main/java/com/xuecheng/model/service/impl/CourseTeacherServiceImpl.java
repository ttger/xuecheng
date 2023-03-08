package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.CourseTeacherMapper;
import com.xuecheng.model.domain.CourseTeacherEntity;
import com.xuecheng.model.service.CourseTeacherService;

/**
 * 课程-教师关系Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacherEntity> implements CourseTeacherService {
    @Autowired
    private CourseTeacherMapper courseTeacherMapper;

}
