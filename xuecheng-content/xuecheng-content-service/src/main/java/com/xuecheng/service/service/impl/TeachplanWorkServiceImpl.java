package com.xuecheng.service.service.impl;

import com.xuecheng.service.service.TeachplanWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.service.mapper.TeachplanWorkMapper;
import com.xuecheng.model.domain.TeachplanWorkEntity;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class TeachplanWorkServiceImpl extends ServiceImpl<TeachplanWorkMapper, TeachplanWorkEntity> implements TeachplanWorkService {
    @Autowired
    private TeachplanWorkMapper teachplanWorkMapper;

}
