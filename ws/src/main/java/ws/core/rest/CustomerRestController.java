package ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.ICustomerService;

@RestController
@RequestMapping("/customers")
@ComponentScan(basePackageClasses={api.core.service.ICustomerService.class})
public class CustomerRestController extends ORestController<ICustomerService> {

 @Autowired
 private ICustomerService customerService;

 @Override
 public ICustomerService getService() {
  return this.customerService;
 }
}