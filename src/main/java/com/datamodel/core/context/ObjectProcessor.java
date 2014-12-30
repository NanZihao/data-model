package com.datamodel.core.context;

import com.datamodel.core.annotation.Entity;
import com.datamodel.core.model.DMObjectDefinition;
import com.datamodel.core.model.ObjectDefinition;

import java.lang.annotation.Annotation;

/**
 * @author Chal Nan 
 */
public class ObjectProcessor {
  public static ObjectDefinition transform(Class clazz) {
    ObjectDefinition objectDefinition = new DMObjectDefinition();

    Entity entity = (Entity)clazz.getAnnotation(Entity.class);

    if (entity == null) {
      return null;
    }

    objectDefinition.setDescription(entity.description());
    objectDefinition.setLabel(entity);
    ((Entity) entity).description();

    return objectDefinition;
  }
}
