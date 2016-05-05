package it.keyp.webapp;

import java.util.List;

import javax.ejb.Local;

@Local
public interface KeyCustomerDAOLocal {
	
	public List<KeyCustomer> getAllCustomers();
	
	public KeyCustomer addCustomers(KeyCustomer keyCustomer);
	

}
