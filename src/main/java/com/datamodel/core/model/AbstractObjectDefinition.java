package com.datamodel.core.model;

import com.datamodel.core.bean.Visibility;

import java.util.List;
import java.util.Map;

/**
 * @author Chal Nan 
 */
public abstract class AbstractObjectDefinition implements ObjectDefinition {
  private String description;
  
  private String label;

  private List<FieldDefinition> fieldDefinitions;

  private Map<String, FieldDefinition> fieldDefinitionMap;
  
  private Visibility visibility;

  public Visibility getVisibility() {
    return visibility;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public FieldDefinition lookupFieldById(String id) {
    return fieldDefinitionMap.get(id);
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<FieldDefinition> getFieldDefinitions() {
    return fieldDefinitions;
  }

  public void setFieldDefinitions(List<FieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }
}
