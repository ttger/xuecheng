package com.xuecheng.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.model.domain.vo.CourseQueryVo;
import com.xuecheng.service.mapper.CourseBaseMapper;
import com.xuecheng.service.service.CourseBaseService;
import com.xuecheng.base.domain.PageParams;
import com.xuecheng.base.domain.PageResult;
import com.xuecheng.base.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuecheng.model.domain.CourseBaseEntity;

/**
 * 课程基本信息Service业务层处理
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBaseEntity> implements CourseBaseService {
    @Autowired
    private CourseBaseMapper courseBaseMapper;

    /**
     * 按条件 分页查询。
     * @param pageParams pageParams
     * @param courseQueryVo courseQueryVo
     * @return PageResult
     */
    @Override
    public CommonResult selectList(PageParams pageParams, CourseQueryVo courseQueryVo) {
        Page<CourseBaseEntity> page = new Page<>();
        if (null != pageParams && pageParams.getPages() != null && pageParams.getSize() != null){
            page.setPages(pageParams.getPages());
            page.setSize(pageParams.getSize());
        }
        LambdaQueryWrapper<CourseBaseEntity> wrapper = new LambdaQueryWrapper<>();
        courseBaseMapper.selectPage(page, wrapper);
        PageResult<CourseBaseEntity> pageResult = new PageResult<>(page.getTotal(), page.getSize(), page.getCurrent(), page.getRecords());
        return CommonResult.success(pageResult);
    }
}
