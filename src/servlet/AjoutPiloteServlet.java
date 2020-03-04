package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Pilote;
import dao.IPiloteDAO;
import dao.PiloteDAO;


@WebServlet("/ajoutpilote")
public class AjoutPiloteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
 
    public AjoutPiloteServlet() {
    	
    	
        super();
        // TODO Auto-generated constructor stub
    }


    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajoutpilote.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pilote pilote1 = new Pilote();
			pilote1.setNom(request.getParameter("nom"));
			pilote1.setPrenom(request.getParameter("prenom"));
			pilote1.setTelephone(request.getParameter("telephone"));
			
		IPiloteDAO dao = new PiloteDAO();
		
		dao.addPilot(pilote1);

		this.getServletContext().getRequestDispatcher("/AjoutReussi").forward(request, response);
	}

}
