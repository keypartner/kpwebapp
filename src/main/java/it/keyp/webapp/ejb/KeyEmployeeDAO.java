package it.keyp.webapp.ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.keyp.webapp.domain.KeyEmployee;

public class KeyEmployeeDAO implements KeyEmployeeDAOLocal {
	
	@PersistenceContext(unitName = "MyPU")
	EntityManager em;

	@Override
	public List<KeyEmployee> getAllEmpoyees() {
		return em.createNamedQuery("KeyEmployee.findAll", KeyEmployee.class).getResultList();
	}

}
