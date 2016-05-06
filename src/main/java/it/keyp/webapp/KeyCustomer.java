/**
 * 
 */
package it.keyp.webapp;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Giovanni Mezzullo
 *
 */
@Entity
@Table(name="HELLOKYEPARTNER")
@NamedQueries({
    @NamedQuery(name = "KeyCustomer.findAll", query = "SELECT e FROM KeyCustomer e"),
})
public class KeyCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String job;

	private String city;

	@Temporal(TemporalType.DATE)
	private Date insertionDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCitta() {
		return city;
	}

	public void setCitta(String citta) {
		this.city = citta;
	}

	public Date getDatainserimento() {
		return insertionDate;
	}

	public void setDatainserimento(Date datainserimento) {
		this.insertionDate = datainserimento;
	}

	@Override
	public String toString() {
		return "KeyCustomer [job=" + job + ", citta=" + city + "]";
	}


}
