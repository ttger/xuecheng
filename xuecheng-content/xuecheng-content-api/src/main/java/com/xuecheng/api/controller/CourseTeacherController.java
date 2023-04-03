package com.xuecheng.api.controller;

import com.xuecheng.service.service.CourseTeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 课程-教师关系Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/teacher")
public class CourseTeacherController {

    private String prefix = "mapper/model/teacher";

    @Autowired
    private CourseTeacherService courseTeacherService;

}
