package com.xuecheng.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.mapper.MqMessageHistoryMapper;
import com.xuecheng.model.domain.MqMessageHistoryEntity;
import com.xuecheng.model.service.MqMessageHistoryService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class MqMessageHistoryServiceImpl extends ServiceImpl<MqMessageHistoryMapper, MqMessageHistoryEntity> implements MqMessageHistoryService {
    @Autowired
    private MqMessageHistoryMapper mqMessageHistoryMapper;

}
