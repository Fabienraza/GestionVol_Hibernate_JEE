package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Pilote;
import beans.Vol;
import dao.IPiloteDAO;
import dao.IVolDAO;
import dao.PiloteDAO;
import dao.VolDAO;


@WebServlet("/AjoutVol")
public class AjoutVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
    public AjoutVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pilote> listePilote = new ArrayList<Pilote>();
		IPiloteDAO dao = new PiloteDAO();
		
		dao.getPilotList();
		
		request.setAttribute("listeP", listePilote);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajoutvol.jsp").forward(request, response);
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vol vol = new Vol();
		
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("datevol"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
			vol.setDateVol(date);
		
		Pilote p = new Pilote();
		p.setIdPilote(Integer.parseInt(request.getParameter("idPiloteVol")));
			
			vol.setPilote(p);
		
		IVolDAO access = new VolDAO();
		
		access.addVol(vol);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajoutreussi.jsp").forward(request, response);
		
	}

}
