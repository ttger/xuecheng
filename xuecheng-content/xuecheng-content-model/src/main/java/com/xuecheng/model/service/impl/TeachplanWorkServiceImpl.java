package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.TeachplanWorkMapper;
import com.xuecheng.model.domain.TeachplanWorkEntity;
import com.xuecheng.model.service.TeachplanWorkService;

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
