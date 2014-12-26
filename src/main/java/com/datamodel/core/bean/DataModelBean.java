package com.datamodel.core.bean;

import com.datamodel.core.model.AbstractElementModel;

/**
 * DataModelBean would be used as a 'collection' to provide element according to id.
 * @author Chal Nan 
 */
public interface DataModelBean {

  AbstractElementModel lookupElementById(String id);
}
