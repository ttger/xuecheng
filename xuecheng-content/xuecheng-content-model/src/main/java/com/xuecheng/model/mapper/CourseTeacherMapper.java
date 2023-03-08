package com.xuecheng.model.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.xuecheng.model.domain.CourseTeacherEntity;

/**
 * 课程-教师关系Mapper接口
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Mapper
public interface CourseTeacherMapper extends BaseMapper<CourseTeacherEntity> {


}