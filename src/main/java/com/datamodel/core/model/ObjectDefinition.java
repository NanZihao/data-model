package com.datamodel.core.model;

import com.datamodel.core.bean.Visibility;

import java.util.List;

/**
 * @author Chal Nan
 */
public interface ObjectDefinition {

  String getMsgKey();

  String getLabel();

  FieldDefinition lookupFieldDefinitionById(String id);

  Visibility getVisibility();

  void setVisibility(Visibility visibility);

  List<FieldDefinition> getFieldDefinition();

  String getName();
  
  
}
