package com.xuecheng.service.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.xuecheng.model.domain.CourseBaseEntity;

/**
 * 课程基本信息Mapper接口
 * 
 * @author zwh
 * @date 2023-03-07
 */
@Mapper
public interface CourseBaseMapper extends BaseMapper<CourseBaseEntity> {


}
