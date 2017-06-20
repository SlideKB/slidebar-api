package com.github.slidekb.api;

import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PlatformSpecific {
    Platform value();
}
