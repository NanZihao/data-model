package com.datamodel.core.annotation;

import com.datamodel.core.bean.DataType;
import com.datamodel.core.bean.Visibility;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Chal Nan
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface Field {
  Visibility visibility() default Visibility.NOT_VISIBLE;

  String dataSource() default "";

  int maxLength() default 0;

  String prefixValue() default "";

  String id() default "";

  String name() default "";

  boolean isRequired() default false;

  boolean isEditable() default false;

  DataType dataType() default DataType.STRING;

  String type() default "";
}
