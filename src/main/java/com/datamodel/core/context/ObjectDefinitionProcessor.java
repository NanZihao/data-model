package com.datamodel.core.context;

import com.datamodel.core.model.ObjectDefinition;

import java.util.Map;

/**
 * @author Chal Nan 
 */
public interface ObjectDefinitionProcessor {
  void doProcess(Map<String, ObjectDefinition> objectDefinitionMap);

  void init();

  void addFilter(ObjectDefinitionFilter filter);
}
