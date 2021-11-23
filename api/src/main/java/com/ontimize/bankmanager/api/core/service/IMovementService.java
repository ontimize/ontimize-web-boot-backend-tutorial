package com.ontimize.bankmanager.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IMovementService {
	
	// ---- MOVEMENT ----
	public EntityResult movementQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
	public EntityResult movementInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
	public EntityResult movementUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
	public EntityResult movementDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;

	// 	---- MOVEMENTTYPES ----
	public EntityResult movementTypeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
	public EntityResult movementTypeInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
	public EntityResult movementTypeUpdate(Map<String, Object> attributes, Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
	public EntityResult movementTypeDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
}