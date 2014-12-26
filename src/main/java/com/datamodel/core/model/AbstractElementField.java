package com.datamodel.core.model;

import com.datamodel.core.bean.DataTypeEnum;

/**
 * @author Chal Nan 
 */
public abstract class AbstractElementField implements ElementField {

  private Class relatedTypeClass;
  
  private DataTypeEnum dataType;
  
  private String name;
  
  private String description;
  
  private String label;
  
  private boolean isRequired;
  
  private boolean isModified;
 
  private String group;
  
  private String picklistId;
  
  private String parentPicklistId;


  @Override
  public DataTypeEnum getFieldType() {
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
