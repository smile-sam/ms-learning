package com.ms.learning.designpatterns.strategy.ch5;

import java.lang.annotation.*;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 16:20
 * @version: v1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TaxTypeAnnotation {
    TaxType taxType();
}
