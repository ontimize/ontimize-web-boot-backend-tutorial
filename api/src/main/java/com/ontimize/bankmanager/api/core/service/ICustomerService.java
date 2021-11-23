package com.ontimize.bankmanager.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface ICustomerService {

 // ---- CUSTOMER ----

 public EntityResult customerQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;
 public EntityResult customerDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;

 // ---- CUSTOMER TYPE ----
 public EntityResult customerTypeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerTypeInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerTypeUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;
 public EntityResult customerTypeDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
 
 // ---- CUSTOMER ACCOUNT ----
 public EntityResult customerAccountQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerAccountInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
 public EntityResult customerAccountUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;
 public EntityResult customerAccountDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
 
 // ---- VCUSTOMERACCOUNT ----
 public EntityResult vCustomerAccountQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult vCustomerAccountDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
 
 // -- LONG TASK --
 public EntityResult longTaskQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;

}