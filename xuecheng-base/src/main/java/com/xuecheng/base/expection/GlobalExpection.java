package com.xuecheng.base.expection;

import com.xuecheng.base.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 全局异常处理
 */
@RestControllerAdvice
@Slf4j
public class GlobalExpection {


    @ExceptionHandler(RRExpection.class)
    public CommonResult rrexpection(RRExpection e){
        log.info("异常了："+e.getMessage());
        return CommonResult.error(e.getMessage());
    }

//    @ExceptionHandler(RuntimeException.class)
//    public CommonResult rrexpection1(RuntimeException e){
//        log.info("异常了："+e.getMessage());
//        return CommonResult.error(e.getMessage());
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult rrexpection1(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        List<String> errorList = bindingResult.getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        String join = StringUtils.join(errorList, ',');
        log.info("参数异常了："+join);
        return CommonResult.error(join);
    }
}
