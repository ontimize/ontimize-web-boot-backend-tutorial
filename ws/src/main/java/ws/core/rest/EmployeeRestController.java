package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
@ComponentScan(basePackageClasses = { api.core.service.IEmployeeService.class })
public class EmployeeRestController extends ORestController<IEmployeeService> {

	@Autowired
	private IEmployeeService employeeService;

	@Override
	public IEmployeeService getService() {
		return this.employeeService;
	}
}