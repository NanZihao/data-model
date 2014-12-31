package com.datamodel.core.context;

import com.datamodel.core.model.ObjectDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chal Nan 
 */
public class ObjectDefinitionProcessorImpl implements ObjectDefinitionProcessor {
  private List<ObjectDefinitionFilter> filterList;

  public static ObjectDefinitionProcessor DEFAULT = new ObjectDefinitionProcessorImpl();
  
  private ObjectDefinitionProcessorImpl() {
    init();
  }

  @Override
  public void doProcess(Map<String, ObjectDefinition> objectDefinitionMap) {
    if (filterList == null || filterList.size() == 0) {
      return;
    }

    for (ObjectDefinitionFilter filter : filterList) {
       filter.doFilter(objectDefinitionMap);
    }
  }

  @Override
  public void init() {
    if (filterList == null) {
      filterList = new ArrayList<ObjectDefinitionFilter>();
    }
    //TODO add filter here
  }

  @Override
  public void addFilter(ObjectDefinitionFilter filter) {
    if (filterList == null) {
      filterList = new ArrayList<ObjectDefinitionFilter>();
    }
    filterList.add(filter);
  }


}
