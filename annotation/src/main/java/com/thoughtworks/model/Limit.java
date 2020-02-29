package com.thoughtworks.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface Limit {
    int min() default 1;
    int max() default 140;
}
