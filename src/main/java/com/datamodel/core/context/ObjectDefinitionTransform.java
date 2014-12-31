package com.datamodel.core.context;

import com.datamodel.core.model.ObjectDefinition;

import java.util.Map;

/**
 * @author Chal Nan 
 */
public interface ObjectDefinitionTransform {
  Map<String, ObjectDefinition> transform(Class<?>[] classes);

}
