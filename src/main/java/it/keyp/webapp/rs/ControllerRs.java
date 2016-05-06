/**
 * 
 */
package it.keyp.webapp.rs;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import it.keyp.webapp.domain.KeyCustomer;
import it.keyp.webapp.ejb.KeyCustomerDAOLocal;

@Path("customers")
@ApplicationScoped
public class ControllerRs {

	Logger log = Logger.getLogger(ControllerRs.class);

	@EJB
	KeyCustomerDAOLocal keyCustomerDAO;

	@GET
	@Produces("application/json")
	public KeyCustomer[] get() {
 		List<KeyCustomer> listKeyCust = keyCustomerDAO.getAllCustomers();
		log.info("Trovati N. ["+listKeyCust.size()+"] Clienti Keypartner...");
		return listKeyCust.toArray(new KeyCustomer[0]);
	}

	@GET
	@Path("add/{name}/{city}")
	@Produces("application/json")
	public KeyCustomer insert(@PathParam("name") String name,
			@PathParam("city") String city){
		KeyCustomer keyCustomer = new KeyCustomer();
		keyCustomer.setCity(city);
		keyCustomer.setName(name);
		keyCustomer.setInsertionDate(new Date());
		return keyCustomerDAO.addCustomers(keyCustomer);
	}


}
