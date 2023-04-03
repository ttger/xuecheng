package com.xuecheng.api.controller;

import com.xuecheng.service.service.CourseMarketService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 课程营销信息Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/market")
public class CourseMarketController {

    private String prefix = "mapper/model/market";

    @Autowired
    private CourseMarketService courseMarketService;

}
