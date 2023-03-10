package com.xuecheng.api.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xuecheng.model.domain.CourseBaseEntity;
import com.xuecheng.model.domain.vo.CourseBaseVO;
import com.xuecheng.model.domain.vo.CourseQueryVo;
import com.xuecheng.service.mapper.CourseBaseMapper;
import com.xuecheng.service.service.CourseBaseService;
import com.xuecheng.service.service.CourseCategoryService;
import com.xuecheng.xuechengbase.domain.PageParams;
import com.xuecheng.xuechengbase.expection.RRExpection;
import com.xuecheng.xuechengbase.untils.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/course")
public class CourseBaseController {

    @Autowired
    private CourseBaseService courseBaseService;

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Autowired
    private CourseCategoryService courseCategoryService;

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

    @PostMapping("/add")
    @ApiOperation(value = "新增课程", response = CommonResult.class)
    public CommonResult addCourse(@RequestBody @Validated CourseBaseVO courseBaseDTO){
        if (1<courseBaseDTO.getCompanyId()){
            throw new RRExpection("啊啊迪赛的机票");
        }
        return null;
    }

    @ApiOperation(value = "按条件查询课程信息， 并分页", response = CommonResult.class)
    @PostMapping("/list")
    public CommonResult list(PageParams pageParams, @RequestBody CourseQueryVo courseQueryVo){
        return courseBaseService.selectList(pageParams, courseQueryVo);
    }
}
