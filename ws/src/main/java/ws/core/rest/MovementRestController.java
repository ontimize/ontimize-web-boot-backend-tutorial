package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.IMovementService;

@RestController
@RequestMapping("/movements")
@ComponentScan(basePackageClasses={api.core.service.IMovementService.class})
public class MovementRestController extends ORestController<IMovementService> {

 @Autowired private IMovementService movementService;

 @Override
 public IMovementService getService() {
  return this.movementService;
 }
}