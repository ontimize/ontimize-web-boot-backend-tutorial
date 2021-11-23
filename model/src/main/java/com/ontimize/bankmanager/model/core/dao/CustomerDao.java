package com.ontimize.bankmanager.model.core.dao;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository(value = "CustomerDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/CustomerDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class CustomerDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "CUSTOMERID";
 public static final String ATTR_CUSTOMERTYPEID = "CUSTOMERTYPEID";
 public static final String ATTR_NAME = "NAME";
 public static final String ATTR_ADDRESS = "ADDRESS";
 public static final String ATTR_COMMENTS = "COMMENTS";
 public static final String ATTR_STARTDATE = "STARTDATE";
 public static final String ATTR_PHOTO = "PHOTO";
 public static final String ATTR_SURNAME = "SURNAME";
 public static final String ATTR_PHONE = "PHONE";
 public static final String ATTR_EMAIL = "EMAIL";
 public static final String ATTR_LONGITUDE = "LONGITUDE";
 public static final String ATTR_LATITUDE = "LATITUDE";

 public CustomerDao() {

  super();
 }

 @Override
 public EntityResult query(Map<?, ?> keysValues, List<?> attributes, List<?> sort, String queryId) {
  if (keysValues.containsKey(CustomerDao.ATTR_ID)) {
   Object value = keysValues.get(CustomerDao.ATTR_ID);
   if (value instanceof String){
    try{
     ((Map<Object, Object>) keysValues).put(CustomerDao.ATTR_ID, Integer.parseInt(value.toString()));
    }catch(Exception ex){}
   }
  }
  return super.query(keysValues, attributes, sort, queryId);
 }
}