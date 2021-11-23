package com.ontimize.bankmanager.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository(value = "BranchDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/BranchDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class BranchDao extends OntimizeJdbcDaoSupport {

    public static final String ATTR_ID = "OFFICEID";
    public static final String ATTR_NAME = "NAME";
    public static final String ATTR_ADDRESS = "ADDRESS";
    public static final String ATTR_STARTDATE = "STARTDATE";
    public static final String ATTR_DETAILS = "DETAILS";
    public static final String ATTR_PHONE = "PHONE";

    public BranchDao() {
        super();
    }
}