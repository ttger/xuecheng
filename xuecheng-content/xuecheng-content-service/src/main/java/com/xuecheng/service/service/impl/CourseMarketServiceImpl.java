package com.xuecheng.service.service.impl;

import com.xuecheng.service.service.CourseMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.service.mapper.CourseMarketMapper;
import com.xuecheng.model.domain.CourseMarketEntity;

/**
 * 课程营销信息Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseMarketServiceImpl extends ServiceImpl<CourseMarketMapper, CourseMarketEntity> implements CourseMarketService {
    @Autowired
    private CourseMarketMapper courseMarketMapper;

}
