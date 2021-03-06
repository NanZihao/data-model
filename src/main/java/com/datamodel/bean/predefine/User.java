package com.datamodel.bean.predefine;

import com.datamodel.core.annotation.Entity;
import com.datamodel.core.annotation.Field;
import com.datamodel.core.bean.DataType;
import com.datamodel.core.bean.Tables;
import com.datamodel.core.bean.Visibility;
import com.datamodel.core.model.SystemConstants;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author Chal Nan
 */
@Entity(description = "User", label = "User", visibility = Visibility.EDITABLE, name = "User")
public class User {
  @Field(visibility = Visibility.READONLY, id = "id", maxLength = SystemConstants.FieldConstans.FIELD_LEN_10, name = "id")
  @Column(name = Tables.DATAMODEL_OBJECT.INTERNAL_ID, nullable = false)
  private String id;
  @Field(visibility = Visibility.EDITABLE, id = "name", maxLength = SystemConstants.FieldConstans.FIELD_LEN_10, name = "name")
  @Column(name = Tables.DATAMODEL_OBJECT.NAME, nullable = false)
  private String name;
  @Column(name = Tables.DATAMODEL_OBJECT.DM_FIELD1)
  @Field(visibility = Visibility.EDITABLE, id = "birthday", maxLength = SystemConstants.FieldConstans.FIELD_LEN_10, name = "birthday", dataType = DataType.DATE)
  private Date birthday;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
