package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.Pilote;
import beans.Vol;
import dao.IPiloteDAO;
import dao.IVolDAO;
import dao.PiloteDAO;
import dao.VolDAO;

public class MainTest {

	public static void main(String[] args) {
//		Pilote pil1 = new Pilote("Dupont", "Eric", "01.23.45.26.54");
//		Pilote pil2 = new Pilote("Dumas", "François", "01.23.78.52.85");
//		
//		IPiloteDAO dao = new PiloteDAO();
//		
//		dao.addPilot(pil1);
//		dao.addPilot(pil2);
//		
//		Vol v1 = new Vol(new Date());
//		Vol v2 = new Vol(new Date(20,02,15));
//		
//		IVolDAO access = new VolDAO();
//		access.addVol(v1);
//		access.addVol(v2);
		
//		List<Pilote> tab = new ArrayList<Pilote>();
//		tab = dao.getPilotList();
//		System.out.println(tab);
		
		List<Vol> tab = new ArrayList<Vol>();
		IVolDAO access = new VolDAO();
		tab= access.getVolList();
		
		System.out.println(tab);
		
	}

}
