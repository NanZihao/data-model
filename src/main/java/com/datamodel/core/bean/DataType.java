package com.datamodel.core.bean;

/**
 * @author Chal Nan 
 */
public enum DataType {
  //TODO add more type here
  INT(Integer.class),
  DOUBLE(Double.class),
  BOOLEAN(Boolean.class),
  
  ;
  protected Class<?> correspondingJavaClazz;

  DataType(Class<?> correspondingJavaClazz) {
    this.correspondingJavaClazz = correspondingJavaClazz;
  }

  DataType() {
  }
  
  
}
