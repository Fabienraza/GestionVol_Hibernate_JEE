package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Pilote {
	@Id
	@GeneratedValue
	private int idPilote;
	
	private String nom;
	private String prenom;
	private String telephone;
	
	
	
									/**************
									 * CONSTRUCTEURS
									 **************/
	
	public Pilote() {
	}
	
	
	public Pilote(int idPilote, String nom, String prenom, String telephone) {
		super();
		this.idPilote = idPilote;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}


	public Pilote(String nom, String prenom, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}

											
												/*******************
												 * GETTER ET SETTER
												 *******************/
	public int getIdPilote() {
		return idPilote;
	}


	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	
	
										/*******************
										 * METHODE TO STRING
										 *******************/
	@Override
	public String toString() {
		return "Pilote [idPilote=" + idPilote + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone
				+ "]";
	}
	
	
	
}
