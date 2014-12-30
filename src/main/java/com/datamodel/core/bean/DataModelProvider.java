package com.datamodel.core.bean;

import com.datamodel.core.model.ObjectDefinition;

/**
 * DataModelBean would be used as a 'collection' to provide element according to id.
 *
 * @author Chal Nan
 */
public interface DataModelProvider {

  ObjectDefinition lookupElementById(String id);
}
