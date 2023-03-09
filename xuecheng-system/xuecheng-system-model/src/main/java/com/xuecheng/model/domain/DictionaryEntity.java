package com.xuecheng.model.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 数据字典对象 dictionary
 * 
 * @author zwh
 * @date 2023-03-08
 */
@TableName("dictionary")
@Data
public class DictionaryEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    /** id标识 */
    private Long id;

    /** 数据字典名称 */
    private String name;

    /** 数据字典代码 */
    private String code;

    /** 数据字典项--json格式
   */
    private String itemValues;


}
