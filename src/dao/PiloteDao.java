package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Pilote;

public class PiloteDao implements IPiloteDao {
	
	SessionFactory sessionfactory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();
	
	
	
	/*
	 * METHODE POUR AJOUTER UN PILOTE
	 */
	@Override
	public int addPilot(Pilote add) {
		try {
			session.beginTransaction();
			session.save(add);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

	
	/*
	 *  METHODE POUR AFFICHER LA LISTE DES PILOTES DE LA BASE DE DONNEE
	 */
	@Override
	public List<Pilote> getPilotList() {
		List<Pilote> tab = new ArrayList<Pilote>();
		
		try {
			session.beginTransaction();
			tab = session.createQuery("from pilote").list();
			return tab;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

}
