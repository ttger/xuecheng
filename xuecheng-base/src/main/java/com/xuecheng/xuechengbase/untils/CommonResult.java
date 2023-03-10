package com.xuecheng.xuechengbase.untils;

import com.xuecheng.xuechengbase.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前后端接口联调，通用返回类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult {
    private String code;
    private String msg;
    private Object data;

    public static CommonResult success(){
        return new CommonResult(Constants.CODE_200,"操作成功",null);
    }

    public static CommonResult success(Object data){
        return new CommonResult(Constants.CODE_200,"操作成功",data);
    }

    public static CommonResult error(){
        return new CommonResult(Constants.CODE_500,"系统错误",null);
    }
    public static CommonResult error(String msg){
        return new CommonResult(Constants.CODE_500,msg,null);
    }


}
