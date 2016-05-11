package it.keyp.webapp.ejb;

import java.util.List;

import javax.ejb.Local;

import it.keyp.webapp.domain.KeyEmployee;

@Local
public interface KeyEmployeeDAOLocal {
	public List<KeyEmployee> getAllEmpoyees();

}
