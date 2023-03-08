package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.MqMessageMapper;
import com.xuecheng.model.domain.MqMessageEntity;
import com.xuecheng.model.service.MqMessageService;

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
