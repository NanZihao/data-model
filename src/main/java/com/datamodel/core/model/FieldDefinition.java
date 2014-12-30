package com.datamodel.core.model;

import com.datamodel.core.bean.DataType;
import com.datamodel.core.bean.Visibility;

import java.io.Serializable;

/**
 * @author Chal Nan 
 */
public interface FieldDefinition extends Serializable {
  DataType getFieldType();

  Class<?> getRelatedTypeClass();

  String getPicklistId();

  String getParentPicklistId();

  String getFieldName();

  Visibility getvisibility(); 
}
