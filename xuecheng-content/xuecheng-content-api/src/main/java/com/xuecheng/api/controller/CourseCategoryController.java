package com.xuecheng.api.controller;

import com.xuecheng.model.domain.CourseCategoryEntity;
import com.xuecheng.service.service.CourseCategoryService;
import com.xuecheng.base.utils.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程分类Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/category")
public class CourseCategoryController {

    @Autowired
    private CourseCategoryService courseCategoryService;

    @GetMapping("getTree")
    @ApiOperation(value = "查询树结构", response = CommonResult.class)
    public CommonResult getTree(String id){
        List<CourseCategoryEntity> list = courseCategoryService.getTree(id);
        return CommonResult.success(list);
    }
}
