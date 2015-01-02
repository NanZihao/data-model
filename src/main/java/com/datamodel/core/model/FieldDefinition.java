package com.datamodel.core.model;

import com.datamodel.core.bean.DataType;
import com.datamodel.core.bean.Visibility;

import java.io.Serializable;

/**
 * @author Chal Nan
 */
public interface FieldDefinition extends Serializable {
  Class<?> getRelatedTypeClass();

  String getPicklistId();

  String getParentPicklistId();

  String getFieldName();

  Visibility getVisibility();

  String getId();

  String getName();

  boolean isRequired();

  DataType getDataType();

  boolean isEditable();

  String getColumnName();

  ObjectDefinition getObjectDefinition();

  ObjectDefinition getDestObjectDef();

  boolean isTransient();

  Integer getMaxLength();

  boolean isCustomField();
}
