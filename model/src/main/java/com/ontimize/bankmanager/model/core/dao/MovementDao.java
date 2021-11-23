package com.ontimize.bankmanager.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository(value = "MovementDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MovementDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class MovementDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "MOVEMENTID";
 public static final String ATTR_ACCOUNTID = "ACCOUNTID";
 public static final String ATTR_DATE = "DATE_";
 public static final String ATTR_CONCEPT = "CONCEPT";
 public static final String ATTR_MOVEMENTTYPEID = "MOVEMENTTYPEID";
 public static final String ATTR_MOVEMENT = "MOVEMENT";
 public static final String ATTR_COMMENTS = "COMMENTS";
 public static final String ATTR_CONCEPT_EN_US = "CONCEPT_EN_US";
 public static final String ATTR_CONCEPT_ES_ES = "CONCEPT_ES_ES";
 public static final String ATTR_CONCEPT_GL_ES = "CONCEPT_GL_ES";
 public static final String ATTR_COMMENTS_EN_US = "COMMENTS_EN_US";
 public static final String ATTR_COMMENTS_ES_ES = "COMMENTS_ES_ES";
 public static final String ATTR_COMMENTS_GL_ES = "COMMENTS_GL_ES";

 public MovementDao() {
  super();
 }

}