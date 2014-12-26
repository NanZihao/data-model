package com.datamodel.core.model;

import com.datamodel.core.bean.DataTypeEnum;

import java.io.Serializable;

/**
 * @author Chal Nan 
 */
public interface ElementField extends Serializable {
  DataTypeEnum getFieldType();

  Class<?> getRelatedTypeClass();

  String getPicklistId();

  String getParentPicklistId();

  String getFieldName();
  
  
}
