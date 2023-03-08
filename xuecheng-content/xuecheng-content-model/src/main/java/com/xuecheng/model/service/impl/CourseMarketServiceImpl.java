package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.CourseMarketMapper;
import com.xuecheng.model.domain.CourseMarketEntity;
import com.xuecheng.model.service.CourseMarketService;

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
