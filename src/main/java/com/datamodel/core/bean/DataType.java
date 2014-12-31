package com.datamodel.core.bean;

import java.util.Date;

/**
 * @author Chal Nan 
 */
public enum DataType {
  //TODO add more type here
  INT(Integer.class),
  DOUBLE(Double.class),
  BOOLEAN(Boolean.class),
  STRING(String.class),
  DATE(Date.class),
  ;
  protected Class<?> correspondingJavaClazz;

  DataType(Class<?> correspondingJavaClazz) {
    this.correspondingJavaClazz = correspondingJavaClazz;
  }

  DataType() {
  }
  
  
}
