package com.ontimize.bankmanager.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bankmanager.api.core.service.IMovementService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/movements")
public class MovementRestController extends ORestController<IMovementService> {

 @Autowired private IMovementService movementService;

 @Override
 public IMovementService getService() {
  return this.movementService;
 }
}