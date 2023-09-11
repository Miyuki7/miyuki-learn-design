package com.miyuki.learn.design.agent;

import java.lang.annotation.*;

/**
 * @author: miyuki
 * @description: 注解
 * @date: 2023/9/11 20:58
 * @version: 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";
}
