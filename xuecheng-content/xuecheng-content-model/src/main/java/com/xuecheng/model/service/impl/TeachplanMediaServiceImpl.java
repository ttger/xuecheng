package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.TeachplanMediaMapper;
import com.xuecheng.model.domain.TeachplanMediaEntity;
import com.xuecheng.model.service.TeachplanMediaService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class TeachplanMediaServiceImpl extends ServiceImpl<TeachplanMediaMapper, TeachplanMediaEntity> implements TeachplanMediaService {
    @Autowired
    private TeachplanMediaMapper teachplanMediaMapper;

}
