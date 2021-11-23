package com.ontimize.bankmanager.model.core.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ontimize.bankmanager.api.core.service.IBranchService;
import com.ontimize.bankmanager.model.core.dao.AccountDao;
import com.ontimize.bankmanager.model.core.dao.BranchDao;
import com.ontimize.bankmanager.model.core.dao.CustomerDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Lazy
@Service("BranchService")
public class BranchService implements IBranchService {

	private static final Logger logger = LoggerFactory.getLogger(BranchService.class);
	@Autowired
	private BranchDao branchDao;
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult branchQuery(Map<String, Object> keysValues, List<String> attributes)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.branchDao, keysValues, attributes);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EntityResult branchInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException {
		return this.daoHelper.insert(this.branchDao, attributes);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EntityResult branchUpdate(Map<String, Object> attributes, Map<String, Object> keyValues)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.update(this.branchDao, attributes, keyValues);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public EntityResult branchDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.branchDao, keyValues);
	}

	// ---- ACCOUNTS ----

	@Override
	public EntityResult accountQuery(Map<String, Object> keysValues, List<String> attributes)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.accountDao, keysValues, attributes);
	}

	@Override
	public EntityResult accountInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException {

		attributes.put(AccountDao.ATTR_ENTITYID, 2095);
		attributes.remove(AccountDao.ATTR_ANID);
		attributes.remove(AccountDao.ATTR_CDID);
		EntityResult toRet = this.daoHelper.insert(this.accountDao, attributes);

		if (toRet.getCode() == EntityResult.OPERATION_WRONG) {
			throw new OntimizeJEERuntimeException(toRet.getMessage());
		}

		StringBuilder builderfDC = new StringBuilder();
		builderfDC.append("00");
		builderfDC.append(attributes.get(AccountDao.ATTR_ENTITYID));
		builderfDC.append(attributes.get(AccountDao.ATTR_OFFICEID));

		Object accountKey = toRet.get(AccountDao.ATTR_ID);
		int accountNumber = this.accountDao.createAccountNumber((int) accountKey);
		int accountDC = this.accountDao.calculateCDID(builderfDC.toString(), accountNumber);

		Map<String, Object> mapAccountData = new HashMap<String, Object>();
		mapAccountData.put(AccountDao.ATTR_CDID, accountDC);
		mapAccountData.put(AccountDao.ATTR_ANID, accountNumber);

		Map<String, Object> mapAccountKey = new HashMap<String, Object>();
		mapAccountKey.put(AccountDao.ATTR_ID, accountKey);

		EntityResult accountUpdate = this.daoHelper.update(this.accountDao, mapAccountData, mapAccountKey);

		if (accountUpdate.getCode() == EntityResult.OPERATION_WRONG) {
			throw new OntimizeJEERuntimeException(accountUpdate.getMessage());
		}
		
		if (attributes.containsKey(CustomerDao.ATTR_ID)) {
			Map<String, Object> insertCustomer = new HashMap<String, Object>();
			insertCustomer.put(CustomerDao.ATTR_ID, attributes.get(CustomerDao.ATTR_ID));
			insertCustomer.put(AccountDao.ATTR_ID, toRet.get(AccountDao.ATTR_ID));
			EntityResult customerAccountInsert = customerService.customerAccountInsert(insertCustomer);
			if (customerAccountInsert.getCode() == EntityResult.OPERATION_WRONG) {
				throw new OntimizeJEERuntimeException(accountUpdate.getMessage());
			}
			
		}

		return toRet;
	}

	@Override
	public EntityResult accountUpdate(Map<String, Object> attributes, Map<String, Object> keyValues)
			throws OntimizeJEERuntimeException {
		attributes.remove(AccountDao.ATTR_ENTITYID);
		attributes.remove(AccountDao.ATTR_OFFICEID);
		attributes.remove(AccountDao.ATTR_CDID);
		attributes.remove(AccountDao.ATTR_ANID);
		return this.daoHelper.update(this.accountDao, attributes, keyValues);
	}

	@Override
	public EntityResult accountDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException {
		return this.daoHelper.delete(this.accountDao, keyValues);
	}

	// ---- ACCOUNTS BALANCE ----

	@Override
	public EntityResult accountBalanceQuery(Map<String, Object> keysValues, List<String> attributes)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.accountDao, keysValues, attributes, AccountDao.QUERY_VACCOUNTBALANCE);
	}

	@Override
	public EntityResult accountBalanceUpdate(Map<String, Object> attributes, Map<String, Object> keyValues)
			throws OntimizeJEERuntimeException {
		return this.accountUpdate(attributes, keyValues);
	}

	@Override
	public EntityResult accountBalanceDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException {
		return this.accountDelete(keyValues);
	}
}