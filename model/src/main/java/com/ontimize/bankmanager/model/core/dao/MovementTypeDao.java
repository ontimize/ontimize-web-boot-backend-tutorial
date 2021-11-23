package com.ontimize.bankmanager.model.core.dao;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository(value = "MovementTypeDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MovementTypeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class MovementTypeDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "MOVEMENTTYPEID";
 public static final String ATTR_DESCRIPTION = "DESCRIPTION";
 public static final String ATTR_DESCRIPTION_EN_US = "DESCRIPTION_EN_US";
 public static final String ATTR_DESCRIPTION_ES_ES = "DESCRIPTION_ES_ES";
 public static final String ATTR_DESCRIPTION_GL_ES = "DESCRIPTION_GL_ES";

 public MovementTypeDao() {

  super();
 }
}