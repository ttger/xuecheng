package com.xuecheng.service.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.druid.util.StringUtils;
import com.xuecheng.service.service.CourseCategoryService;
import com.xuecheng.xuechengbase.untils.DataUntils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.service.mapper.CourseCategoryMapper;
import com.xuecheng.model.domain.CourseCategoryEntity;

/**
 * 课程分类Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategoryEntity> implements CourseCategoryService {

    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    /**
     * 获取 课程分类 树结构，
     * @param id 为空则查询所有
     * @return List<CourseCategoryEntity>
     */
    @Override
    public List<CourseCategoryEntity> getTree(String id) {
        //获取所有课程分类信息
        List<CourseCategoryEntity> list = this.list();
        List<CourseCategoryEntity> parentList;
        //顶层分类
        String parentId = StringUtils.isEmpty(id) ? "0":id;
        if (!StringUtils.isEmpty(id)){
            parentList = list.stream().filter(o->StringUtils.equals(o.getId(),parentId)).collect(Collectors.toList());
        } else {
            parentList = list.stream().filter(o->StringUtils.equals(o.getId(),parentId)).collect(Collectors.toList());
        }

        return DataUntils.buildTree(parentList,list);
    }
}
