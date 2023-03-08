package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.CourseAuditMapper;
import com.xuecheng.model.domain.CourseAuditEntity;
import com.xuecheng.model.service.CourseAuditService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseAuditServiceImpl extends ServiceImpl<CourseAuditMapper, CourseAuditEntity> implements CourseAuditService {
    @Autowired
    private CourseAuditMapper courseAuditMapper;

}
