package com.datamodel.core.model;

import com.datamodel.core.bean.DataType;
import com.datamodel.core.bean.Visibility;

/**
 * @author Chal Nan
 */
public abstract class AbstractFieldDefinition implements FieldDefinition {

  private String relatedTypeClass;
  
  private DataType dataType;

  private String name;

  private String description;

  private String label;

  private String group;

  private String picklistId;

  private String parentPicklistId;

  private boolean isRequired;

  private boolean isEditable;

  private ObjectDefinition objectDefinition;

  private ObjectDefinition destObjectDef;

  private boolean isTransient;

  private boolean isCustomField;

  private Visibility visibility;

  private String id;

  private String columnName;

  private Integer maxLength;

  public String getRelatedTypeClass() {
    return relatedTypeClass;
  }

  public void setRelatedTypeClass(String relatedTypeClass) {
    this.relatedTypeClass = relatedTypeClass;
  }

  @Override
  public String getPicklistId() {
    return picklistId;
  }

  public void setPicklistId(String picklistId) {
    this.picklistId = picklistId;
  }

  @Override
  public String getParentPicklistId() {
    return parentPicklistId;
  }

  public void setParentPicklistId(String parentPicklistId) {
    this.parentPicklistId = parentPicklistId;
  }

  @Override
  public String getFieldName() {
    return name;
  }

  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public boolean isRequired() {
    return isRequired;
  }

  public void setRequired(boolean isRequired) {
    this.isRequired = isRequired;
  }

  public boolean isEditable() {
    return isEditable;
  }

  public void setEditable(boolean isEditable) {
    this.isEditable = isEditable;
  }

  public ObjectDefinition getObjectDefinition() {
    return objectDefinition;
  }

  public void setObjectDefinition(ObjectDefinition objectDefinition) {
    this.objectDefinition = objectDefinition;
  }

  public ObjectDefinition getDestObjectDef() {
    return destObjectDef;
  }

  public void setDestObjectDef(ObjectDefinition destObjectDef) {
    this.destObjectDef = destObjectDef;
  }

  public boolean isTransient() {
    return isTransient;
  }

  public void setTransient(boolean isTransient) {
    this.isTransient = isTransient;
  }

  public boolean isCustomField() {
    return isCustomField;
  }

  public void setCustomField(boolean isCustomField) {
    this.isCustomField = isCustomField;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }
}
