package it.keyp.webapp.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import it.keyp.webapp.domain.KeyCustomer;
import it.keyp.webapp.rs.ControllerRs;

@Stateless
public class KeyCustomerDAO implements KeyCustomerDAOLocal{
	
	@PersistenceContext(unitName="MyPU")
	EntityManager em;
	
	Logger log = Logger.getLogger(ControllerRs.class);


	/*
	 * (non-Javadoc)
	 * @see it.keyp.webapp.KeyCustomerDAOLocal#getAllCustomers()
	 */
	public List<KeyCustomer> getAllCustomers() {
		return em.createNamedQuery("KeyCustomer.findAll", KeyCustomer.class).getResultList();
	}

	/*
	 * (non-Javadoc)
	 * @see it.keyp.webapp.KeyCustomerDAOLocal#addCustomers(it.keyp.webapp.KeyCustomer)
	 */
	public KeyCustomer addCustomers(KeyCustomer keyCustomer) {
		em.persist(keyCustomer);
		log.info("Aggiunto nuovo cliente ==> "+keyCustomer);
		return keyCustomer;
	}
	
	

}
