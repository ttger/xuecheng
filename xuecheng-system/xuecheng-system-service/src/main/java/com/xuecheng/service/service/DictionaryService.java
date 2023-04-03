package com.xuecheng.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.base.utils.CommonResult;
import com.xuecheng.model.domain.DictionaryEntity;

/**
 * 数据字典Service接口
 * 
 * @author zwh
 * @date 2023-03-08
 */
public interface DictionaryService extends IService<DictionaryEntity> {

    /**
     * 获取字典值
     * @param id id
     * @return CommonResult
     */
    CommonResult getDictionary(String id);

    /**
     * 创建字典值
     * @param dictionary dictionary
     * @return CommonResult
     */
    CommonResult createDictionary(DictionaryEntity dictionary);
    /**
     *
     * @param dictionary dictionary
     * @return CommonResult
     */
    CommonResult UpdateDictionary(DictionaryEntity dictionary);
}
