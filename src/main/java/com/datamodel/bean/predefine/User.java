package com.datamodel.bean.predefine;

import com.datamodel.core.annotation.Entity;
import com.datamodel.core.annotation.Field;

import java.util.Date;

/**
 * @author Chal Nan 
 */
@Entity(description = "User")
public class User {
  @Field
  private String id;
  @Field
  private String name;
  @Field
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
