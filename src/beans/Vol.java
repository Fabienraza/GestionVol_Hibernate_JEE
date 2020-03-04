package beans;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Vol {
	
	@Id
	@GeneratedValue
	private int idVol;
	
	
	/*
	 * Pour afficher uniquement la date dans les heures
	 */
	
	@Temporal(TemporalType.DATE)
	private Date dateVol;
	
	/*
	 * @ManyToOne : Permet de relier la table vol avec la table pilote 
	 * Il genere auto une colonne dans la table vol contenant la clé primaire de la table pilote (idPilote) et un nom de base "pilote"
	 * @JoinColumn (name = "idPilote")	: pour renommer la colonne en IdPilote
	 */
	
	@JoinColumn (name = "idPilote")			
	@ManyToOne
	private Pilote pilote;
	
											
											/***************
											 * CONSTRUCTEURS
											 ***************/
	public Vol() {
	}

	public Vol(int idVol, Date dateVol) {
		super();
		this.idVol = idVol;
		this.dateVol = dateVol;
	}

	public Vol(Date dateVol) {
		super();
		this.dateVol = dateVol;
	}


	
											/*****************
											 * GETTER ET SETTER
											 ******************/
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

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

												/*******************
												 * METHODE TO STRING
												*******************/
	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", dateVol=" + dateVol + "]";
	}


}
