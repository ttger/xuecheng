package com.xuecheng.service.service.impl;

import com.xuecheng.service.mapper.MqMessageMapper;
import com.xuecheng.service.service.MqMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.domain.MqMessageEntity;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class MqMessageServiceImpl extends ServiceImpl<MqMessageMapper, MqMessageEntity> implements MqMessageService {
    @Autowired
    private MqMessageMapper mqMessageMapper;

}
