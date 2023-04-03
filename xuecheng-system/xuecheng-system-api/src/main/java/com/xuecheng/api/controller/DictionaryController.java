package com.xuecheng.api.controller;

import com.xuecheng.base.utils.CommonResult;
import com.xuecheng.model.domain.DictionaryEntity;
import com.xuecheng.service.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据字典Controller
 * 
 * @author zwh
 * @date 2023-03-08
 */
@Api("description")
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @ApiOperation("获取字典列表")
    @GetMapping("/getList")
    public List<DictionaryEntity> getList(){
        List<DictionaryEntity> dictionaryEntityList = new ArrayList<>();
        dictionaryEntityList = dictionaryService.list();
        return dictionaryEntityList;
    }

    @ApiOperation("获取字典")
    @GetMapping("/getById/{id}")
    public CommonResult getById(String id){
        return dictionaryService.getDictionary(id);
    }
}
