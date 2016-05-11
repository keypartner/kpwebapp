package it.keyp.webapp.domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: KeyEmployee
 *
 */
@Entity
@Table(name = "EMPLOYEES")
@NamedQueries({ @NamedQuery(name = "KeyEmployee.findAll", query = "SELECT e FROM KeyEmployee e"), })
public class KeyEmployee implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthdate;
	private static final long serialVersionUID = 1L;

	public KeyEmployee() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Date getBirthDate() {
		return birthdate;
	}
	
	public void setBirthDate(Date birthdate) {
		this.birthdate = birthdate;
	}
   
}
