package com.datamodel.core.model;

import com.datamodel.core.bean.Visibility;

/**
 * @author Chal Nan
 */
public interface ObjectDefinition {

  String getMsgKey();

  String getLabel();

  void setLabel(String label);

  String getDescription();

  void setDescription(String description);

  FieldDefinition lookupFieldById(String id);

  Visibility getVisibility();

  void setVisibility(Visibility visibility);
}
