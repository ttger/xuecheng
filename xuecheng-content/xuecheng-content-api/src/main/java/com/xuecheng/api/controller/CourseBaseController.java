package com.xuecheng.api.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xuecheng.model.domain.CourseBaseEntity;
import com.xuecheng.model.mapper.CourseBaseMapper;
import com.xuecheng.model.service.CourseBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程基本信息Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/base")
public class CourseBaseController {

//    @Autowired
//    private CourseBaseService courseBaseService;
//
    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @GetMapping("/getInfo/{id}")
    @ApiOperation(value = "信息查询", response = CourseBaseEntity.class)
    public List<CourseBaseEntity> getInfo(@PathVariable String id){
        CourseBaseEntity baseEntity = new CourseBaseEntity();
        baseEntity.setCompanyName("公司名称");
        baseEntity.setId(123456L);
        List<CourseBaseEntity> courseBaseEntityList = new ArrayList<>();
        courseBaseEntityList.add(baseEntity);
        courseBaseEntityList.addAll(courseBaseMapper.selectList(new QueryWrapper<>()));
        return courseBaseEntityList;
    }
}
