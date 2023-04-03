package com.xuecheng.api.controller;

import com.xuecheng.service.service.CourseAuditService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 【请填写功能名称】Controller
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Api("description")
@RestController
@RequestMapping("/model/audit")
public class CourseAuditController {

    private String prefix = "mapper/model/audit";

    @Autowired
    private CourseAuditService courseAuditService;

}
