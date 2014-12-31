package com.datamodel.core.context;

import com.datamodel.core.model.ObjectDefinition;

import java.util.Map;

/**
 * @author Chal Nan 
 */
public interface ObjectDefinitionFilter {
  void doFilter(Map<String, ObjectDefinition> objectDefinitionMap);
}
