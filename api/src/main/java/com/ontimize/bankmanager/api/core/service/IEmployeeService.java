package com.ontimize.bankmanager.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IEmployeeService {

 // ---- EMPLOYEES ----
 public EntityResult employeeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult employeeInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
 public EntityResult employeeUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
 public EntityResult employeeDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;

 // ---- EMPLOYEETYPES ----
 public EntityResult employeeTypeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
 public EntityResult employeeTypeInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
 public EntityResult employeeTypeUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
 public EntityResult employeeTypeDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
}