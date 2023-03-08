package com.xuecheng.api;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xuecheng.model.domain.CourseBaseEntity;
import com.xuecheng.model.mapper.CourseBaseMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class XuechengContentApiApplicationTests {

    @Autowired
    CourseBaseMapper courseBaseMapper;

    @Test
    @Transactional
    void contextLoads() {

        Assertions.assertNotNull(courseBaseMapper);
        List<CourseBaseEntity> baseEntityList = courseBaseMapper.selectList(new LambdaQueryWrapper<CourseBaseEntity>());
        System.out.println(baseEntityList);
    }

}
