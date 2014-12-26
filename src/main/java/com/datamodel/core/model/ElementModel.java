package com.datamodel.core.model;

import java.util.List;

/**
 * @author Chal Nan 
 */
public interface ElementModel {

  String getMsgKey();

  String getLabel();

  void setLabel(String label);

  String getDescription();

  void setDescription(String description);

  List<ElementField> getElementFields();

  ElementField lookupFieldById(String id);
}
