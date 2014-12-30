package com.datamodel.core.annotation;

import com.datamodel.core.bean.Visibility;
import com.datamodel.core.model.AssociationDefinition;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Chal Nan 
 */
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface Field {
  Visibility visibility() default Visibility.NOT_VISIBLE;

  
}
