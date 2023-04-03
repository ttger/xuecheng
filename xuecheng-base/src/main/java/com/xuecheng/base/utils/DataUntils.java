package com.xuecheng.base.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 数据整理 工具类
 */
@Slf4j
public class DataUntils {


    /**
     * 构建树结构
     * @param list list
     * @return List<T>
     * @param <T> <T>
     */
    public static <T> List<T> buildTree(List<T> toplist, List<T> list){
        //递归次数限制, 默认100
        int count = 100;
//        //时间
//        long start = System.currentTimeMillis();
        Class aClass = list.get(0).getClass();
        List<T> parentList = toplist;
        try {
            Field parentid = aClass.getDeclaredField("parentid");
            Field id = aClass.getDeclaredField("id");
            //最顶层数据
//            parentList = list.stream().filter(o -> {
//                try {
//                    Field field = o.getClass().getDeclaredField("parentid");
//                    field.setAccessible(true);
//                    String value = (String) field.get(o);
//                    return StringUtils.isEmpty(value) || "0".equals(value);
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            }).collect(Collectors.toList());
            //按照parentid分组
            Map<String, List<T>> listMap = list.stream().collect(Collectors.groupingBy(o -> {
                try {
                    Field field = o.getClass().getDeclaredField("parentid");
                    field.setAccessible(true);
                    return(String) field.get(o);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }));

            //构建树-插入数据
            insertData(parentList, listMap, count);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

//        long end = System.currentTimeMillis();
//        log.info("耗时："+(end-start));
        return parentList;
    }

    //子数据插入父级

    /**
     * 递归插入数据
     * @param parentList parentList
     * @param childMap childMap
     * @param count count
     * @param <T> <T>
     */
    private static <T> void insertData(List<T> parentList, Map<String, List<T>> childMap, int count){
        for (T t : parentList) {
            try {
                Field fieldChild = t.getClass().getDeclaredField("child");
                Field fieldId = t.getClass().getDeclaredField("id");
                fieldChild.setAccessible(true);
                fieldId.setAccessible(true);
                String id = (String) fieldId.get(t);
                //存在子集就设置值。并且递归子集
                if (childMap.containsKey(id)){
                    fieldChild.set(t, childMap.get(id));
                    insertData(childMap.get(id), childMap, count);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
