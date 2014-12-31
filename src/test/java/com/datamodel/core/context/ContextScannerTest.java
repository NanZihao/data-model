package com.datamodel.core.context;

import com.datamodel.core.model.ObjectDefinition;

import java.util.List;
import java.util.Map;

/**
 * @author Chal Nan
 */
public class ContextScannerTest {
  public static void main(String[] args) {
    List<Class> list = ContextScanner.scan(new String[]{"com.datamodel.bean.predefine"});

    Class[] classes = new Class[list.size()];
    
    Map<String, ObjectDefinition> map = ObjectDefinitionTransformImpl.DEFAULT.transform(list.toArray(classes));

    ObjectDefinitionProcessorImpl.DEFAULT.doProcess(map);

    for (Map.Entry<String, ObjectDefinition> entry : map.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

  }
}
