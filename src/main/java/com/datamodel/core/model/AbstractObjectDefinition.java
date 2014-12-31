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

  private String name;

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
  public FieldDefinition lookupFieldDefinitionById(String id) {
    return fieldDefinitionMap.get(id);
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<FieldDefinition> getFieldDefinition() {
    return fieldDefinitions;
  }

  public void setFieldDefinition(List<FieldDefinition> fieldDefinitions) {
    this.fieldDefinitions = fieldDefinitions;
  }

  public void setFieldDefinitionMap(Map<String, FieldDefinition> fieldDefinitionMap) {
    this.fieldDefinitionMap = fieldDefinitionMap;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
