package com.ruoyi.common.annotation;

import java.lang.annotation.*;

/**
 * @author Wangpeidong
 * @create 2019-11-19 23:35
 **/
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReqNoAccess {
}
