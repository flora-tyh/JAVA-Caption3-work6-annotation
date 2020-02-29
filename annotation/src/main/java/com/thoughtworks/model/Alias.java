package com.thoughtworks.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Alias {
    String alias() default "newName";
}
