package com.xuecheng.api.controller;

import com.xuecheng.service.service.TeachplanService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 课程计划Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/teachplan")
public class TeachplanController {

    private String prefix = "mapper/model/teachplan";

    @Autowired
    private TeachplanService teachplanService;

}
