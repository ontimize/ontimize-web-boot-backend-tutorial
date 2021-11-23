package com.ontimize.bankmanager.ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.bankmanager.api.core.service.IBranchService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/branches")
public class BranchRestController extends ORestController<IBranchService> {

	@Autowired
	private IBranchService branchService;

	@Override
	public IBranchService getService() {
		return this.branchService;
	}
}