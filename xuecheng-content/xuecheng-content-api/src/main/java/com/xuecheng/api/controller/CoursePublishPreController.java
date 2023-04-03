package com.xuecheng.api.controller;

import com.xuecheng.service.service.CoursePublishPreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 课程发布Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/pre")
public class CoursePublishPreController {

    private String prefix = "mapper/model/pre";

    @Autowired
    private CoursePublishPreService coursePublishPreService;

}
