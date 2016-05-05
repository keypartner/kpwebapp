/**
 * 
 */
package it.keyp.webapp;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
/**
 * @author Giovanni Mezzullo
 *
 */

import org.apache.log4j.Logger;

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
	@Path("aggiungi/{job}/{citta}")
	@Produces("application/json")
	public KeyCustomer insert(@PathParam("job") String job,
			@PathParam("citta") String citta){
		KeyCustomer keyCustomer = new KeyCustomer();
		keyCustomer.setCitta(citta);;
		keyCustomer.setJob(job);
		keyCustomer.setDatainserimento(new Date());
		return keyCustomerDAO.addCustomers(keyCustomer);
	}


}
