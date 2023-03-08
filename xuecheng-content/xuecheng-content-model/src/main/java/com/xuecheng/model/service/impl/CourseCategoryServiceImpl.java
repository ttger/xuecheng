package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.CourseCategoryMapper;
import com.xuecheng.model.domain.CourseCategoryEntity;
import com.xuecheng.model.service.CourseCategoryService;

/**
 * 课程分类Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategoryEntity> implements CourseCategoryService {
    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

}
