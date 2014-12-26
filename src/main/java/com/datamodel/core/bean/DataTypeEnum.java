package com.datamodel.core.bean;

/**
 * @author Chal Nan 
 */
public enum DataTypeEnum {
  //TODO add more type here
  INT(Integer.class),
  DOUBLE(Double.class),
  BOOLEAN(Boolean.class),
  
  ;
  protected Class<?> correspondingJavaClazz;

  DataTypeEnum(Class<?> correspondingJavaClazz) {
    this.correspondingJavaClazz = correspondingJavaClazz;
  }

  DataTypeEnum() {
  }
  
  
}
