package com.datamodel.core.annotation;

import com.datamodel.core.bean.Visibility;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Chal Nan 
 */
@Target({TYPE})
@Retention(RUNTIME)
public @interface Entity {
  Visibility visibility() default Visibility.NOT_VISIBLE;

  String description() default "";
  
  
}
