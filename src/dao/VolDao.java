package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import beans.Vol;

public class VolDAO implements IVolDAO {
	
	SessionFactory sessionfactory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionfactory.openSession();

	@Override
	public int addVol(Vol add) {
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
	
	
	

	@Override
	public List<Vol> getVolList() {
		List<Vol> tab = new ArrayList<Vol>();
		
		try {
			session.beginTransaction();
			tab = session.createQuery("from Vol").list();
			return tab;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
