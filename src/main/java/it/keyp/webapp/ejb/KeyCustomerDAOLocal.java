package it.keyp.webapp.ejb;

import java.util.List;

import javax.ejb.Local;

import it.keyp.webapp.domain.KeyCustomer;

@Local
public interface KeyCustomerDAOLocal {
	
	public List<KeyCustomer> getAllCustomers();
	
	public KeyCustomer addCustomers(KeyCustomer keyCustomer);
	

}
