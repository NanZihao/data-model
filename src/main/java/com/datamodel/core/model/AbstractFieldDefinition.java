package com.datamodel.core.model;

import com.datamodel.core.bean.DataType;

/**
 * @author Chal Nan 
 */
public abstract class AbstractFieldDefinition implements FieldDefinition {

  private Class relatedTypeClass;
  
  private DataType dataType;
  
  private String name;
  
  private String description;
  
  private String label;
  
  private boolean isRequired;
  
  private boolean isModified;
 
  private String group;
  
  private String picklistId;
  
  private String parentPicklistId;


  @Override
  public DataType getFieldType() {
    return dataType;
  }

  @Override
  public Class<?> getRelatedTypeClass() {
    return relatedTypeClass;
  }

  @Override
  public String getPicklistId() {
    return picklistId;
  }

  @Override
  public String getParentPicklistId() {
    return parentPicklistId;
  }

  @Override
  public String getFieldName() {
    return name;
  }
}
