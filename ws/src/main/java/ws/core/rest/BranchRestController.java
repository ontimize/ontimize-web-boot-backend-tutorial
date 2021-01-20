package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.IBranchService;

@RestController
@RequestMapping("/branches")
@ComponentScan(basePackageClasses={api.core.service.IBranchService.class})
public class BranchRestController extends ORestController<IBranchService> {

 @Autowired private IBranchService branchService;

 @Override
 public IBranchService getService() {
  return this.branchService;
 }
}