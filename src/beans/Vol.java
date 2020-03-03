package beans;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vol {
	
	@Id
	@GeneratedValue
	private int idVol;
	private Date dateVol;
	

	
	
	/*
	 * CONSTRUCTEURS
	 */
	public Vol() {
	}

	public Vol(int idVol, Date dateVol) {
		super();
		this.idVol = idVol;
		this.dateVol = dateVol;
	}

	
	
	
	
	/*
	 * GETTER ET SETTER
	 */
	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public Date getDateVol() {
		return dateVol;
	}

	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
	}

	
	
	
	/*
	 * METHODE TO STRING
	 */
	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", dateVol=" + dateVol + "]";
	}


}
