package com.ontimize.bankmanager.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository(value = "EmployeeDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/EmployeeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class EmployeeDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_ID = "EMPLOYEEID";
 public static final String ATTR_EMPLOYEETYPEID = "EMPLOYEETYPEID";
 public static final String ATTR_EMPLOYEENAME = "EMPLOYEENAME";
 public static final String ATTR_EMPLOYEESURNAME = "EMPLOYEESURNAME";
 public static final String ATTR_EMPLOYEEADDRESS = "EMPLOYEEADDRESS";
 public static final String ATTR_EMPLOYEECOMMENTS = "EMPLOYEECOMMENTS";
 public static final String ATTR_EMPLOYEESTARTDATE = "EMPLOYEESTARTDATE";
 public static final String ATTR_EMPLOYEEPHOTO = "EMPLOYEEPHOTO";
 public static final String ATTR_EMPLOYEEEMAIL = "EMPLOYEEEMAIL";
 public static final String ATTR_OFFICEID = "OFFICEID";
 public static final String ATTR_EMPLOYEEPHONE = "EMPLOYEEPHONE";
 public static final String ATTR_LONGITUDE = "LONGITUDE";
 public static final String ATTR_LATITUDE = "LATITUDE";
 public static final String ATTR_AGENDAXML = "AGENDAXML";

 public EmployeeDao() {

  super();
 }
}