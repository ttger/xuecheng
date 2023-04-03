package com.xuecheng.base.config;

import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Slf4j
public class customValidation implements ConstraintValidator<custom, String> {
    private int min;
    private int max;

    public customValidation() {
    }

    @Override
    public void initialize(custom constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        log.info("实际值s: "+s);
        log.info("期望值min: "+this.min+"   max:"+this.max);

        return "z".equals(s);
    }
}
