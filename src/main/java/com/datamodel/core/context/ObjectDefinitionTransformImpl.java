package com.datamodel.core.context;

import com.datamodel.core.annotation.Entity;
import com.datamodel.core.model.AbstractFieldDefinition;
import com.datamodel.core.model.AbstractObjectDefinition;
import com.datamodel.core.model.DMFieldDefinition;
import com.datamodel.core.model.DMObjectDefinition;
import com.datamodel.core.model.FieldDefinition;
import com.datamodel.core.model.ObjectDefinition;

import javax.persistence.Column;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Chal Nan 
 */
public class ObjectDefinitionTransformImpl implements ObjectDefinitionTransform {

  private ObjectDefinitionTransformImpl() {
  }

  public static ObjectDefinitionTransform DEFAULT = new ObjectDefinitionTransformImpl();

  private static ObjectDefinition doTransform(Class<?> clazz) {
    DMObjectDefinition objectDefinition = new DMObjectDefinition();
    if (clazz == null) {
      return objectDefinition;
    }

    Entity entity = (Entity) clazz.getAnnotation(Entity.class);
    Field[] fields = clazz.getDeclaredFields();

    if (entity == null) {
      return null;
    }

    objectDefinition.setDescription(entity.description());
    objectDefinition.setVisibility(entity.visibility());
    objectDefinition.setLabel(entity.label());
    objectDefinition.setName(entity.name());

    List<FieldDefinition> fieldDefinitionList = new ArrayList<FieldDefinition>();
    Map<String, FieldDefinition> fieldDefinitionMap = new HashMap<String, FieldDefinition>();
    for (Field field : fields) {
      DMFieldDefinition fieldDefinition = new DMFieldDefinition();
      com.datamodel.core.annotation.Field fieldAnnotation = field.getAnnotation(com.datamodel.core.annotation.Field.class);
      Column columnAnnotation = field.getAnnotation(Column.class);
      
      if (fieldAnnotation == null) {
        continue;
      }

      if (columnAnnotation == null) {
        continue;
      }
      fieldDefinition.setName(fieldAnnotation.name());
      fieldDefinition.setMaxLength(fieldAnnotation.maxLength());
      fieldDefinition.setVisibility(fieldAnnotation.visibility());
      fieldDefinition.setRequired(fieldAnnotation.isRequired());
      fieldDefinition.setRelatedTypeClass(fieldAnnotation.type());

      fieldDefinition.setColumnName(columnAnnotation.name());
      
      // add more set method
      fieldDefinitionList.add(fieldDefinition);
      fieldDefinitionMap.put(fieldAnnotation.name(), fieldDefinition);
    }
    objectDefinition.setFieldDefinition(fieldDefinitionList);
    objectDefinition.setFieldDefinitionMap(fieldDefinitionMap);

    return objectDefinition;
  }


  @Override
  public Map<String, ObjectDefinition> transform(Class<?>[] classes) {
    Map<String, ObjectDefinition> objectDefinitionMap = new HashMap<String, ObjectDefinition>();
    if (classes == null || classes.length == 0) {
      return objectDefinitionMap;
    }
    
    for (Class<?> clazz : classes) {
      ObjectDefinition objectDefinition = doTransform(clazz);
      if (objectDefinition == null) {
        continue;
      }
      objectDefinitionMap.put(objectDefinition.getName(), objectDefinition);
    }
    
    return objectDefinitionMap;
  }

}
