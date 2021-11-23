package com.ontimize.bankmanager.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IBranchService {

    // ---- BRANCHES ----
    public EntityResult branchQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    public EntityResult branchInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
    public EntityResult branchUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    public EntityResult branchDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    
    // ---- ACCOUNTS ----
    public EntityResult accountQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    public EntityResult accountInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
    public EntityResult accountUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    public EntityResult accountDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    
    // ---- ACCOUNT BALANCE ----

    public EntityResult accountBalanceQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    public EntityResult accountBalanceUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    public EntityResult accountBalanceDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
}