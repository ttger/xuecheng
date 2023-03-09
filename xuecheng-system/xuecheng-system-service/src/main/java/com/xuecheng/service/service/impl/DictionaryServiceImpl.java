package com.xuecheng.service.service.impl;

import java.util.List;

import com.xuecheng.service.mapper.DictionaryMapper;
import com.xuecheng.service.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.domain.DictionaryEntity;

/**
 * 数据字典Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-08
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, DictionaryEntity> implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

}
