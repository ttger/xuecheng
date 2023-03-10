package com.xuecheng.service.service.impl;

import com.xuecheng.service.mapper.TeachplanMapper;
import com.xuecheng.service.service.TeachplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.domain.TeachplanEntity;

/**
 * 课程计划Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class TeachplanServiceImpl extends ServiceImpl<TeachplanMapper, TeachplanEntity> implements TeachplanService {
    @Autowired
    private TeachplanMapper teachplanMapper;

}
